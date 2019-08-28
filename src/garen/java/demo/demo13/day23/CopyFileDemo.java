package garen.java.demo.demo13.day23;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("C:\\Users\\Administrator\\Desktop\\read.JPG");
        FileOutputStream fos = new FileOutputStream("F:\\read2.JPG");

/*        int len = 0;
        int times = 0;

        while((len = fis.read()) != -1){
            times++;
            fos.write(len);
        }
        System.out.println(times);
        fis.close();
        fos.close();*/
        byte[] des = new byte[2048];
        int lens = 0;
        while ((lens = fis.read(des))!= -1) {
            fos.write(des, 0, lens);
        }

    }
}
