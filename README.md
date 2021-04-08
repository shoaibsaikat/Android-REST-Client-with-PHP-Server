# AndroidRESTClientFromPHPServer
It's an example of an android app, which uses REST client to consume a PHP server data.
There are two modules here. One is PHP REST server another is Android REST client.


How to run:
1. First install XAMPP
2. Now paste RESTServer folder into your XAMPP htdocs folder.
4. For the database you can use my existing DB from, https://github.com/shoaibsaikat/CMS-in-PHP or, you can create your own DB and use my RESTServer code as a guideline.
5. Edit db.php file according to your DB connection,if needed.
6. Run the XAMPP server and test the url you want to consume at Android app.
7. Now open my RestClient into AndroidStudio.
8. Replace String url ="http://192.168.0.105/RESTServer/getposts.php"; in MainActivity.java file, with your url.
9. Now run the app into Android device.

Tips:
1. For home testing, your server/PC and Andorid device should be connected to the same LAN. Replace localhost with your ip address.
