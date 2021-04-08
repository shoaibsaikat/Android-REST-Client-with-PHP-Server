<?php
require_once("db_functions.php");

$dataArray = array();
if ($result = getAllPosts()) {
    while ($row = mysqli_fetch_assoc($result)) {
        $dataArray[] = $row;
    }
    echo json_encode($dataArray);
}

?>