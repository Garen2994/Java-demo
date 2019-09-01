package garen.java.demo.demo15.day32;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main (String[] args) throws IOException{
        Socket socket = new Socket("127.0.0.1",8888);
        OutputStream out = socket.getOutputStream();
        out.write("Hello Server".getBytes());
        //读取服务器端的回复消息
        InputStream in = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int len = in.read(bytes);

        System.out.println(new String(bytes,0,len));
//        out.close();
        socket.close();
    }
}
