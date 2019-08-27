package garen.java.demo.demo13.day22;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\Administrator\\Desktop\\notebook\\day22homework.txt");
        System.out.println(f);
        String separator = File.separator;
        System.out.println(separator);
//        System.out.println();
    }
}
