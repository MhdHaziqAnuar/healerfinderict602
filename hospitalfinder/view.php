<?php
//simple script to view comments
// Citation

/***
  Ismail, M. H. (2021, July 11). Android: Building a Simple RESTful Client-Server Application. Coding Malaya. https://youtu.be/LjWyxm5HPK8
***/

require_once('db.php');

//select all row from table checkin
$query = "SELECT * FROM healreport ORDER BY date DESC";
$result=mysqli_query($link,$query);
?>
<!doctype html>
<html>
<head>
  <title>Healer Finder Location Report</title>
  <link rel="stylesheet" href="https://www.w3schools.com/w3css/4/w3.css">
</head>
<style>
body {
  background-color: #FFFFFF;
  max-width: 500px;
  margin: auto;
}
#h1back {
	width:100%;
	height:100%;
	background-color: #3F51B5;
	color: #a2faee;
	font-family:verdana;
}
#h4back {
	width:100%;
	height:100%;
	background-color: #FFFFFF;
	color: #3F51B5
	font-family:arial;
}
</style>
<body>
<h1 id="h1back"><center>Healer Finder Location Report</h1></center>
<h4 id="h4back"><center><i>List of report that have been submitted from the Healer Finder Mobile App.</i></h4></center>
<hr>
<ol>
<?php foreach ($result as $row) {

?>
<li>
    <ul style="list-style-type:disc;">
        <li>Report ID: <?=$row['id']?></li>
		<li><?=$row['name']?></a> has posted the location report from <i>Healer Finder Mobile App.</i></li>
        <li>Date: <?=$row['date']?></li>
        <li>Location: <?=$row['location']?></li>
		<li>Coordinate: <?=$row['coordinate']?></li>
        
</ul><br />
</li>
<?php } ?>
</ol>
</body>
</html>
