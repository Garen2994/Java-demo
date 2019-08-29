package garen.java.demo.demo13.day24;

import java.io.*;

public class BufferedReaderDemo {
    public static void main(String[] args) throws IOException {

        long start = System.currentTimeMillis();
        method("F:\\a.txt","F:\\a1.txt");
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end - start) + "ms");
    }

    public static void method(String src,String dest) throws IOException {

        BufferedReader in = new BufferedReader(new FileReader(src));
        BufferedWriter wr = new BufferedWriter(new FileWriter(dest));
        String line = null;
        while ((line = in.readLine()) != null) {

//            System.out.println(line);
            wr.write(line);
            wr.newLine(); //换行
        }
        wr.write("copy的文件");
        wr.newLine();

        in.close();
        wr.close();

    }
}
