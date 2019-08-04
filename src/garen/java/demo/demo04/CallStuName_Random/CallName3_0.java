package garen.java.demo.demo04.CallStuName_Random;

import java.util.ArrayList;
import java.util.Random;

/*
全班同学中随机的找出一名同学，打印这名同学的个人信息。
我们对本案例进行分析，得出如下分析结果：
	1.存储全班同学信息（姓名、年龄）
		将容器换成集合，集合中存的是Student类型
	2.打印全班同学每一个人的信息（姓名、年龄）
		 遍历集合
	3.在班级总人数范围内，随机产生一个随机数，

	查找该随机数所对应的同学信息（姓名、年龄）
	而在存储同学姓名时采用ArrayList集合来解决多个学生信息的存储问题
	*/
public class CallName3_0 {
    public static void main(String[] args) {
        ArrayList<Student> array = new ArrayList<Student>();
        //调用添加方法
        add(array);

        //调用遍历集合
        System.out.println("========所有学生名单========");
        printArrayList(array);

        //调用随机点名
        System.out.println("========随机点名一位同学========");
        randomCallStudent(array);

    }

    /*
        定义方法,实现存储学生的姓名和年龄
        创建StudentName类型变量,存储到集合中
     */
    public static void add(ArrayList<Student> array) {

        Student stu1 = new Student();
        Student stu2 = new Student();
        Student stu3 = new Student();
        Student stu4 = new Student();
        Student stu5 = new Student();

        stu1.name = "侯佳琳1号";
        stu1.age = 18;

        stu2.name = "侯佳琳2号";
        stu2.age = 19;

        stu3.name = "侯佳琳3号";
        stu3.age = 20;

        stu4.name = "侯佳琳4号";
        stu4.age = 21;

        stu5.name = "侯佳琳5号";
        stu5.age = 22;

        array.add(stu1);
        array.add(stu2);
        array.add(stu3);
        array.add(stu4);
        array.add(stu5);

    }

    /*
        总览学生的信息,遍历集合
    */
    public static void printArrayList(ArrayList<Student> array) {
        System.out.println("   Name" + "    " + "Age");
//        for (int i = 0; i < array.size(); i++) {
//            Student stu = array.get(i);
//            System.out.println(stu.name + "  " + stu.age);
//        }
        for (Student stu : array)
            System.out.println(" "+stu.name + "  " + stu.age);
    }

    public static void randomCallStudent(ArrayList<Student> array) {
        Random ran = new Random();
        int index = ran.nextInt(array.size());
        Student stu = array.get(index);
        System.out.println(" "+stu.name + "  " + stu.age);
    }
}
