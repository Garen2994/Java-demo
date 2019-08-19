package garen.java.demo.demo07.day13.demo6;

public class Person {

    private String name;
    private int age;
    static String id ;

    Person(int age) {
        this.age = age;
        System.out.println("Person(age)参数的构造方法执行");
    }
    Person(){
        System.out.println("Person无参数的构造方法执行");
    }

    public Person(String name) {
        this.name = name;
        System.out.println("Person(name)参数的构造方法执行");
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Person(name,age)参数的构造方法执行");
    }

    {//构造代码块
        System.out.println("constructed code block is running...");
    }//每创建一个对象均会执行一次构造代码块

    static{
        id = "18031211326";
        System.out.println("static code block is running...");
    }

}
