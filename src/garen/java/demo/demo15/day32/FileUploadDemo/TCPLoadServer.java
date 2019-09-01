package garen.java.demo.demo15.day32.FileUploadDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPLoadServer {
    public static void main(String[] args)throws IOException {
        ServerSocket server = new ServerSocket(8888);
        //让服务器一直处于监听状态，即死循环
        while(true) {
            /*
            * 采用多线程，有一个客户端启动，就开启一个线程
            */
            Socket socket = server.accept();

            new Thread(()-> {  //这里用lambda表达式

                try {
                        InputStream in = socket.getInputStream();
                        File file = new File("F:\\upload");

                        if (!file.exists()) {
                            file.mkdirs();
                        }
                        //防止文件同名被覆盖,重新定义文件命名规则
                        String filename = "copy" + System.currentTimeMillis() + new Random().nextInt(1000) + ".jpg";

                        FileOutputStream fos = new FileOutputStream(file + File.separator + filename);

                        int len = 0;
                        byte[] bytes = new byte[1024];
                        while ((len = in.read(bytes)) != -1) { //read()的阻塞用
                            fos.write(bytes, 0, len);
                        }
                        socket.getOutputStream().write("上传成功".getBytes());  //因为read()没有读到结束标记，所以阻塞，进入死循环，后面的执行不到，因此并没有写入

                        fos.close();
                        socket.close();
                    }catch(IOException e){
                        e.printStackTrace();
                    }
                }
            ).start();

        }
//        server.close();
    }
}
