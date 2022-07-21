<?php
//simple api for database insertion
// Citation

/***
  Ismail, M. H. (2021, July 11). Android: Building a Simple RESTful Client-Server Application. Coding Malaya. https://youtu.be/LjWyxm5HPK8
***/

require_once('db.php');

 if (!isset($_POST['name']) && !isset($_POST['coordinate']) ){
   die("Error incomplete HTTP request");
 }

//filter all inputs for securing
$POSTV = filter_input_array(INPUT_POST,
    ['name' => FILTER_SANITIZE_STRING,
     'coordinate' => FILTER_SANITIZE_STRING,
     'location' => FILTER_SANITIZE_STRING,
    ]
);
$name = $POSTV['name'];
$coordinate = $POSTV['coordinate'];
$location = $POSTV['location'];
$addr = $_SERVER['REMOTE_ADDR'];

$query= "INSERT INTO healreport (id, name, coordinate, location, ip_address)
VALUES (NULL,'$name','$coordinate', '$location', '$addr')";

$result=mysqli_query($link, $query);

if (!$result) {

  echo mysqli_error($link);

} else {

echo "Location Report Posted";
}
 ?>
