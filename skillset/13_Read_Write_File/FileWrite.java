import java.util.Scanner;
import java.io.*;


public class FileWrite{

    public static void main (String args[]) {
        // Scanner scnr = new Scanner(System.in);
        System.out.println("Developer: Carson Darrow");
        System.out.println("Progam captures info and writes it to file.");

        String myFile = "filewrite.txt";

        try{
            FileWriter fileWriter = new FileWriter(myFile);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            bufferedWriter.write("Fourscore and seven years ago our fathers brought forth, ");
            bufferedWriter.newLine();
            bufferedWriter.write("on this continent, a new nation, conceived in liberty");
            bufferedWriter.newLine();
            bufferedWriter.write("and dedicated to the proposition that all men are created equal.");
            bufferedWriter.close();

            System.out.println("\nFile write finished!");
        }
        catch (IOException ex){
            System.out.println("Error writing to file '" + myFile + "'");
        }
    } // end of MAIN
}
