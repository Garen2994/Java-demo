package garen.java.demo.demo15.day32;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/*
* 创建BS版本的TCP服务器*/
public class BSTCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(8080);
        Socket socket = server.accept();

        InputStream in = socket.getInputStream();
        /*byte[] bytes = new byte[1024];
        int len =0;
        while((len = in.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));*/
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        String line = br.readLine();
        String[] arr = line.split(" ");
        //文件路径
        String htmlpath = arr[1].substring(1);
        System.out.println(htmlpath);
        FileInputStream fis = new FileInputStream(htmlpath);

        OutputStream os = socket.getOutputStream();
        //http响应协议头 固定内容
        os.write("HTTP/1.1 200 OK\r\n".getBytes());
        os.write("Content-Type:text/html\r\n".getBytes());
        os.write("\r\n".getBytes());

        byte[] bytes = new byte[1024];
        int len = 0;
        while ((len = in.read(bytes)) != -1) {
            os.write(bytes, 0, len);
//            System.out.println(new String(bytes,0,len));
        }

        fis.close();
        server.close();
        socket.close();
    }
}

