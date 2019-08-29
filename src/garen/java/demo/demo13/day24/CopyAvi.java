package garen.java.demo.demo13.day24;
/*
 * 使用高效流和基本流复制.avi文件
 * 基本流 FileInputStream / FileOutputStream
 * 高效流 BufferOutputStream / BufferInputStream
 */

import java.io.*;

public class CopyAvi {
    public static void main(String[] args) throws IOException {
        String src = "C:\\Users\\Administrator\\Desktop\\test.avi";
        String dest = "F:\\test_copy1.avi";

        System.out.println("========基本流逐字节=========");
        long start = System.currentTimeMillis();
        method1(src,dest);

        long end = System.currentTimeMillis();
        System.out.println("耗时：" +(end - start) + "ms");
        System.out.println("========基本流字节数组=======");
        long start1 = System.currentTimeMillis();
        method2(src,dest);

        long end1 = System.currentTimeMillis();
        System.out.println("耗时：" +(end1 - start1) + "ms");

        System.out.println("========高效流逐字节=========");

        long start2 = System.currentTimeMillis();
        method3(src, dest);

        long end2 = System.currentTimeMillis();
        System.out.println("耗时：" + (end2 - start2) + "ms");

        System.out.println("========高效流字节数组=======");

        long start3 = System.currentTimeMillis();
        method4(src, dest);

        long end3 = System.currentTimeMillis();
        System.out.println("耗时：" + (end3 - start3) + "ms");

    }

    //基本流逐个字节交换复制
    public static void method1(String src, String des) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(des);
        int num = 0;
        int ch = 0;
        while ((ch = fis.read()) != -1) {
            num++;
            fos.write(ch);
//            System.out.println((char)len);
        }
        System.out.println(num + "次交换");
        fis.close();
        fos.close();
    }

    //基本流字节数组复制
    public static void method2(String src, String des) throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(des);
        byte[] b = new byte[1024];
        int num = 0;
        int ch = 0;
        while ((ch = fis.read(b)) != -1) {
            num++;
            fos.write(b, 0, ch);
        }
        System.out.println(num +" 次交换"); //一个4926976字节的文件，用长度为2048的字节数组存储需要while循环2406次 2406*2048=4926976
        System.out.println("字节数：" + b.length);
        fis.close();
        fos.close();
    }

    //高效流
    public static void method3(String src, String des) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(des));
        int num = 0;
        int ch = -1;
        while ((ch = bis.read()) != -1) {
            num++;
            bos.write(ch);
        }
        System.out.println(num + " 次交换");
        bis.close();
        bos.close();
    }

    public static void method4(String src, String des) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(des));

        int num = 0;
        byte[] buffer = new byte[1024];
        int ch = -1;
        while ((ch = bis.read(buffer)) != -1) {
            num++;

            bos.write(buffer, 0, ch);

        }

        System.out.println(num + " 次交换");
        System.out.println("字节数：" + buffer.length);

        bis.close();
        bos.close();

    }
}

