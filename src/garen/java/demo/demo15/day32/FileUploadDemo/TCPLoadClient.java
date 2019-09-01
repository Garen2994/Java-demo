package garen.java.demo.demo15.day32.FileUploadDemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/*
 *  实现TCP文件上传客户端
 *  实现步骤:
 *    1. Socket套接字连接服务器
 *    2. 通过Socket获取字节输出流,写图片
 *    3. 使用自己的流对象,读取图片数据源
 *         FileInputStream
 *    4. 读取图片,使用字节输出流,将图片写到服务器
 *       采用字节数组进行缓冲
 *    5. 通过Socket套接字获取字节输入流
 *       读取服务器发回来的上传成功
 *    6. 关闭资源
 */
public class TCPLoadClient {
    public static void main(String[] args) throws IOException {
        //创建本地字节流输入对象 FileInputStream，绑定要读取的数据源
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\test.JPG");
        // 创建客户端对象
        Socket socket = new Socket("127.0.0.1", 8888);
        //使用getOutputStream()
        OutputStream out = socket.getOutputStream();
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes)) != -1) {

        //使用Outputtream对象的write()方法，将读取到的文件上传到服务器
            out.write(bytes,0,len);
        }
        //使用Socket的getInputStream()方法，获取网络字节输入流InputStream

        socket.shutdownOutput();//给服务端写入一个结束标志

        InputStream in = socket.getInputStream();
        while((len = in.read(bytes)) != -1){
            System.out.println(new String(bytes,0,len));
        }

        socket.close();
        fis.close();

    }
}
