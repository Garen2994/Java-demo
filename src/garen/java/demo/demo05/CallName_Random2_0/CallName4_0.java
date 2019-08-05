package garen.java.demo.demo05.CallName_Random2_0;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*
    随机点名器案例重构:
    使用private get和set 方法
	 * 思路：
	 * 第一步：存储全班同学信息
	 * 第二步：打印全班同学每一个人的信息
	 * 第三部：随机对学生点名，打印学生信息
	 */
public class CallName4_0 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();

        //存储学生信息到array
        addStudent(array);
        //打印每一个学生信息
        System.out.println("=========所有学生名单==========");
        System.out.println("Name" +   "   " + "Age");
        printAllStu(array);
        //随机点名一个学生
        System.out.println("===========随机点名===========");
        randomCallName(array);
    }

    public static void addStudent(ArrayList<Student> array) {
        /*
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        Student stu4 = new Student();
        Student stu5 = new Student();

        stu1.setName("侯佳琳1号");
        stu1.setAge(18);
        stu2.setName("侯佳琳2号");
        stu2.setAge(19);
        stu3.setName("侯佳琳3号");
        stu3.setAge(20);
        stu4.setName("侯佳琳4号");
        stu4.setAge(21);
        stu5.setName("侯佳琳5号");
        stu5.setAge(22);

        array.add(stu1);
        array.add(stu2);
        array.add(stu3);
        array.add(stu4);
        array.add(stu5);
        */


        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {

            Student stu = new Student();
            System.out.println("存储第" + (i+1) + "个学生姓名：");
            stu.setName(sc.next());
            System.out.println("存储第" + (i+1) + "个学生年龄：");
            stu.setAge(sc.nextInt());
            array.add(stu);
        }

    }

    public static void printAllStu(ArrayList<Student> array) {

        for (Student stu : array)
            System.out.println(stu.getName() + "   " + stu.getAge());

    }

    public static void randomCallName(ArrayList<Student> array) {

        int index = new Random().nextInt(array.size());
        Student stu = array.get(index);
        System.out.println(stu.getName() + "   " + stu.getAge());

    }
}