package garen.java.demo.demo03;

import java.util.Random;
import java.util.Scanner;

/*随机点名器案例分析
        * A 随机点名器案例分析
        1. 存储姓名
        2. 预览所有人的姓名
        3. 随机出一个人的姓名
        * B: 需求
        * 随机点名器，即在全班同学中随机的打印出一名同学名字。

        * 优化之前的，封装成多个方法*/
public class CallName2_0 {
    public static void main(String[] args) {
        System.out.println("--------随机点名器--------");
        // 创建一个存储多个同学名字的容器（数组）
        String[] students = new String[3];
        addStuName(students);
        printStuName(students);
        String luckyname = randomStuName(students);
        System.out.println("随机点名为:" + luckyname);
    }

    public static void addStuName(String[] students) {
        //键盘输入多个名字存储到容器中
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < students.length; i++) {
            System.out.println("存储第" + (i + 1) + "个名称：");
            students[i] = sc.next();
        }
    }

    public static void printStuName(String[] students) {
        for (String each : students)
            System.out.println(each);
    }

    public static String randomStuName(String[] students) {

        int index = new Random().nextInt(students.length);
        String name = students[index];
        return name;

    }
}

