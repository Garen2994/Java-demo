package garen.java.demo.demo13.day24;

import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class OutputStreamWriterDemo {
    public static void main(String[] args) throws IOException {

        FileOutputStream fos = new FileOutputStream("F:\\a.txt");
        OutputStreamWriter osw  = new OutputStreamWriter(fos,"utf-8");

        osw.write("你好");
        osw.close();

    }
}
