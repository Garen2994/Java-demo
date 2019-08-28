package garen.java.demo.demo13.day23;

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\a1.txt");
/*        int len = 0;
        while((len = fis.read()) != -1) {

            System.out.println((char)len);

        }*/
        byte[] bytes = new byte[39];
        int len1 = fis.read(bytes);

        System.out.println(new String(bytes));
        System.out.println(len1);

        /*
        int i = fis.read();
        System.out.println((char) i);

        i = fis.read();
        System.out.println((char) i);

        i = fis.read();
        System.out.println((char) i);

        i = fis.read();
        System.out.println((char) i);

        i = fis.read();
        System.out.println((char) i);
*/


        fis.close();
    }
}
