<!DOCTYPE html>
<html lang="en">
  <head>
	<style>

*{
  box-sizing: border-box;
}

.column {
  float: left;
  width: 33.33%;
  padding: 5px;
}

/* Clearfix (clear floats) */
.row::after {
  content: "";
  clear: left;
  display: table;
}
</style>
</head>
<body>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="My online portfolio that illustrates skills acquired while working through various project requirements.">
		<meta name="author" content="Carson Darrow.">
    <link rel="icon" href="favicon.ico">

		<title>CD - Assignment2</title>		
		<?php include_once("../css/include_css.php"); ?>			
  </head>
</style>
  <body>

		<?php include_once("../global/nav.php"); ?>
		
		<div class="container">
			<div class="starter-template">
				<div class="page-header">
					<?php include_once("global/header.php"); ?>	
				</div>
				<p class="text-justify">
					<strong>Description:</strong> * Course title, your name, assignment requirements, as per A1
							* Screenshot of running application’s first user interface
							* Screenshot of running application’s second user interface
							* Bitbucket repo links
				</p>

				<h4>Screenshot Recipe App</h4>
				<div class="row">
 				<div class="column">
    				<img src="img/screen_1.png" alt="Recipe 1" style="width:75%">
  				</div>
  				<div class="column">
    				<img src="img/screen_2.png" alt="Recipe 2" style="width:75%">
  				</div>
				<div class="colum">
					<img src="img/reciperecord.mov" alt="video" style="width:5%">
				</div>
				</div>

				<h4>Skillset #1-#3</h4>
				<img src="img/Even_or_Odd.png" class="img-responsive center-block" alt="Skillset 1">
				<img src="img/largestNum.png" class="img-responsive center-block" alt="Skillset 2">
				
				<?php include_once "global/footer.php"; ?>

			</div> <!-- starter-template -->
    </div> <!-- end container -->

		<!-- Bootstrap JavaScript
				 ================================================== -->
		<!-- Placed at end of document so pages load faster -->		
		<?php include_once("../js/include_js.php"); ?>			
  </body>
</html>
