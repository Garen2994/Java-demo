package garen.java.demo.demo13.day22.RecursionPractice;

import java.io.File;

import java.lang.System;

/*
 *  对一个目录的下的所有内容,进行完全的遍历
 *  编程技巧,方法的递归调用,自己调用自己
 */
public class RecurDirDemo {
    static int num = 0;
    public static void main(String[] args) {

        File dir = new File("F:\\My_Github");
        long start = System.currentTimeMillis();
        getAllDir(dir);
        long end = System.currentTimeMillis();
        System.out.println("耗时：" + (end-start) + " ms");
        System.out.println("getAllDir() 调用了 " + num + " 次");
    }
    public static void getAllDir(File dir){
        num++;
        System.out.println(dir);
        System.out.println("=============================================");
        File[] fileArr = dir.listFiles();
        for (File f : fileArr) {
            if (f.isDirectory()) {
                getAllDir(f);
            }else{
                System.out.println(f);
            }
        }

    }

}
