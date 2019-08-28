package garen.java.demo.demo13.day23;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamDemo {
    public static void main(String[] args) throws IOException {
//        File f = new File("F:\\a1.txt");
//        System.out.println(f.createNewFile());

        FileOutputStream fos = new FileOutputStream("F:\\a1.txt",true);
        byte[] bytes = {71,97,114,101,110};
//        fos.write(71);
        fos.write(bytes);
        fos.write(" is good".getBytes(),0,8);

        fos.write("\r\nHello World".getBytes());

        fos.close();
    }
}
