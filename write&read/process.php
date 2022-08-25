<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
		<meta name="description" content="My online portfolio which showcases my skills and projects using various softwares, languages, and tools.">
		<meta name="author" content="Carson Darrow">
    <link rel="icon" href="favicon.ico">

	<style>
		html
			{
				height: 100%;
			}
			body 
			{
				background-image: linear-gradient(to bottom right, #72A0C1, #72A0C1, #72A0C1);
				background-image: linear-gradient(to right,#72A0C1, #E6F7FF, #72A0C1);
			}

	</style>
		<title>LIS4381 - Write/Read File</title>		
		<?php include_once("../css/include_css.php"); ?>			
 
  
</head>

  <body>


<?php
// define variables and set to empty values
$comment = "";

if ($_SERVER["REQUEST_METHOD"] == "POST") {
  if (empty($_POST["comment"])) {
    $comment = "";
  } else {
    $comment = test_input($_POST["comment"]);
  }
}

function test_input($data) {
  $data = trim($data);
  $data = stripslashes($data);
  $data = htmlspecialchars($data);
  return $data;
}
?>

<?php include_once("../global/nav.php"); ?>


<div class="container-fluid">
		 <div class="starter-template">
						<div class="page-header">
							<?php include_once("global/header.php"); ?>	
						</div>
						<?php
						echo $comment;
						echo "<br><br><br>";
						?>
						
		<?php include_once "global/footer.php"; ?>
		</div>
</div> <!-- end table-responsive -->

</body>
</html>