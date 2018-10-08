# PoorMansParallelism

Java code for Mandelbrot Fractal Set using TCP Client and Server connection.

STEPS FOR RUNNING


This application is first build connection between Client and the Server and then exchange strings too. 
While making the connection, InetAddress is static and need to change that in MyServerSocket.java
Once the Server started running, it will generate Port number which should add in the MyClientSocket.java. Then the client will start too.
When both server and client are running, the application can exchange text.
Server will start MandelBrot which is design in JFrames. The mandelbrot set image will appear when clicking the start button.
Once clicking the stop button, server and client connection will remove.
