
package client;

 /**
 *
 * @author Visakha
 */ 

import java.io.IOException;
import java.io.PrintWriter;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class MyClientSocket {

    private Socket socket;
    private Scanner scanner;

    private MyClientSocket(InetAddress serverAddress, int serverPort) throws Exception {
        this.socket = new Socket(serverAddress, serverPort);
        this.scanner = new Scanner(System.in);
    }

    private void start() throws IOException {
        String input;
        while (true) {          //Once the connection is made,client and server can exchange Strings. 
            input = scanner.nextLine();
            PrintWriter out = new PrintWriter(this.socket.getOutputStream(), true);
            out.println(input);
            out.flush();
        }
    }
// Program starts from here. Client first connect with the server using InetAddress and Port number.
    
    public static void main(String[] args) throws Exception {
        //MyClientSocket client = new MyClientSocket("192.168.0.9",50200);
//        MyClientSocket client = new MyClientSocket(
//                InetAddress.getByName("192.168.0.9"),
//                Integer.parseInt(args[0]));
        MyClientSocket client = new MyClientSocket(
                InetAddress.getByName("192.168.0.9"),50203);
        System.out.println("\r\nConnected to Server: " + client.socket.getInetAddress());
        client.start();
    }
}
