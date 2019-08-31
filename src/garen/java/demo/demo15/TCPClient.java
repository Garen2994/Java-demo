package garen.java.demo.demo15;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main (String[] args) throws IOException{
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream out = socket.getOutputStream();

        out.write("Hello Server".getBytes());

//        out.close();
        socket.close();
    }
}
