package garen.java.demo.demo13.day22;

import java.io.File;
import java.io.IOException;

public class FileDemo01 {
    public static void main(String[] args)throws IOException {
//        function();
//        function_1();
//        function_2();
//        function_3();
        function_4();
    }

    public static void function(){
        File parent = new File("f:");
        File file = new File(parent,"workspace");
        File file1 = new File("d:","workspace");
        System.out.println(file);
        System.out.println(file1);
    }
    public static void function_1()throws IOException{
        File file = new File("F:\\a.txt");
        boolean b = file.createNewFile();
        System.out.println(b);
    }
    public static void function_2(){
        File file = new File("F:\\a");
        boolean b = file.mkdirs();
        System.out.println(b);
        boolean b1 = file.delete();
        System.out.println(b1);

    }
    public static void function_3(){
        File file = new File("F:\\a.txt");
        System.out.println(file.getName());
        File parent = file.getParentFile();
        System.out.println(file.getParent());
        System.out.println(file.getAbsolutePath());
        System.out.println(file.length());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.exists());
    }
    public static void function_4() {
        File[] fileArr = File.listRoots();//所有根目录
        for (File file : fileArr) {
            System.out.println(file);
        }

        File file = new File("F:\\workspace");
        File[] files = file.listFiles();

        for (File file1 : files) {
            System.out.println(file1);
        }
        String[] strArr = file.list();
        System.out.println(strArr.length);
        for (String str : strArr) {
            System.out.println(str);
        }


    }
}
