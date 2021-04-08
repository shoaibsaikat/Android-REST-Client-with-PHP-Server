<?php
require_once("db.php");

function getAllPosts() {
    global $connection;
    $query = "SELECT    posts.post_id,
                        posts.post_category_id,
                        posts.post_title,
                        posts.post_author,
                        posts.post_date,
                        posts.post_image,
                        posts.post_content,
                        posts.post_tags,
                        posts.post_status,
                        categories.cat_title
                        FROM posts
                        LEFT JOIN categories ON categories.cat_id = posts.post_category_id
                        ORDER BY post_status DESC";
    // $query .= "FROM posts LEFT JOIN catagories ON catagories.cat_id = posts.post_category_id ORDER BY post_status DESC";
    if ($result = mysqli_query($connection, $query))
        return $result;
    return null;
}
?>