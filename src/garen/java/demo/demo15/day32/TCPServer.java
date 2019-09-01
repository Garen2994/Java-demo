package garen.java.demo.demo15.day32;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8888);
        Socket socket = server.accept();
        InputStream in = socket.getInputStream();
        byte[] b = new byte[1024];
        int len = in.read(b);
        System.out.println(new String(b, 0, len));
        OutputStream out = socket.getOutputStream();
        out.write("Hi!Thanks".getBytes());

        socket.close();
        server.close();
    }
}
