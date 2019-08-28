package garen.java.demo.demo13.day23;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterCopyDemo {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("F:\\a.txt");
        FileWriter fw = new FileWriter("F:\\a-copy.txt");
        char[] source = new char[2048];
        int lens = 0;

        while((lens = fr.read(source)) != -1) {
            fw.write(source,0,lens);
//            System.out.println((char)lens);
        }

//            fw.write("你好！");
/*
        while((lens = fr.read()) != -1) {
                fwrite.write(lens);
        }
*/
        fr.close();
        fw.close();
    }
}
