package server;

import java.io.IOException;
//import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
//import java.util.Date;

import packet.packetHeader;

/**
 * A TCP server that runs on port 9090.  When a client connects, it
 * sends the client the current date and time, then closes the
 * connection with that client.  Arguably just about the simplest
 * server you can write.
 */
public class server {

    /**
     * Runs the server.
     */
    public static void main(String[] args) throws IOException {
        ServerSocket listener = new ServerSocket(9090);
        packetHeader p = new packetHeader("Hello World!!!");
        String temp = p.getData();
        
        try {
            while (true) {
                Socket socket = listener.accept();
                System.out.println("Got something to process\n");
                try {
                    //PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                    //out.println(new Date().toString());
                	socket.getOutputStream().write(temp.getBytes(), 0, temp.length());
                } finally {
                    socket.close();
                }
            }
        }
        finally {
            listener.close();
        }
    }
}
