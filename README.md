# AndroidRESTClientFromPHPServer
An android app which uses REST client to consume a PHP server. There are two modules here. One is PHP REST server another is Android REST client.


How to run:
1. First install XAMPP
2. Now paste RESTServer folder into your XAMPP htdocs folder.
3. For the database you can use my existing DB from, https://github.com/shoaibsaikat/CMS-in-PHP or, you can create your own DB and use my RESTServer code as a guideline.
4. Run the XAMPP server and test the url you want to consume at Android app.
5. Now open my RestClient into AndroidStudio.
6. Replace String url ="http://192.168.0.105/RESTServer/getposts.php"; in MainActivity.java file, with your url.
7. Now run the app into Android device.

Tip: For home testing, your server/PC and Andorid device should be connected to the same LAN. Replace localhost with your ip address.