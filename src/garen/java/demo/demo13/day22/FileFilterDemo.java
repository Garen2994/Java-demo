package garen.java.demo.demo13.day22;

import java.io.File;

public class FileFilterDemo {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\notebook");
        File[] fileArr = file.listFiles(new MyFilter());
        for (File f : fileArr) {
            System.out.println(f);
        }
    }
}
