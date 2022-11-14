package com.example.newsreader;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;

public class ItemsActivity extends AppCompatActivity implements AdapterView.OnItemClickListener
{
    private RSSFeed feed;
    private FileIO io;

    private TextView titleTextView;
    private ListView itemsListView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_items);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.mipmap.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

        io = new FileIO(getApplicationContext());

        titleTextView = (TextView) findViewById(R.id.titleTextView);
        itemsListView = (ListView) findViewById(R.id.itemsListView);

        itemsListView.setOnItemClickListener(this);

        new DownloadFeed().execute();
    }

        class DownloadFeed extends AsyncTask<Void, Void, Void> {
            @Override
            protected Void doInBackground(Void... params) {
                feed = io.readFile();
                return null;
            }

            @Override
            protected void onPostExecute(Void result) {
                Log.d("News reader", "Feed download");
                new ReadFeed().execute();
            }
        }

        class ReadFeed extends AsyncTask<Void, Void, Void> {
            @Override
            protected Void doInBackground(Void... params) {
                feed = io.readFile();
                return null;
            }

            @Override
            protected void onPostExecute(Void result) {
                Log.d("News reader", "Feed read");
                ItemsActivity.this.updateDisplay();
            }
        }

        public void updateDisplay() {
            if (feed == null) {
                titleTextView.setText("Unable to get RSS feed");
                return;
            }
            titleTextView.setText(feed.getTitle());
            ArrayList<RSSItem> items = feed.getAllItems();

            ArrayList<HashMap<String, String>> data = new ArrayList<>();
            for (RSSItem item : items) {
                HashMap<String, String> map = new HashMap<>();
                map.put("pubDate", item.getPubDateFormatted());
                map.put("title", item.getTitle());
                data.add(map);
            }

            int resource = R.layout.listview_item;
            String[] from = {"pubDate", "title"};
            int[] to = {R.id.pubDateTextView, R.id.titleTextView};

            SimpleAdapter adapter = new SimpleAdapter(this, data, resource, from, to);
            itemsListView.setAdapter(adapter);

            Log.d("News reader", "Feed displayed");
        }

        @Override
                public void onItemClick(AdapterView<?> parent, View v, int position, long id)
        {
            RSSItem item = feed.getItem(position);

            Intent intent = new Intent(this, ItemsActivity.class);

            intent.putExtra("pubDate", item.getPubDate());
            intent.putExtra("title", item.getTitle());
            intent.putExtra("description", item.getDescription());
            intent.putExtra("link", item.getLink());

            this.startActivity(intent);
        }
    }