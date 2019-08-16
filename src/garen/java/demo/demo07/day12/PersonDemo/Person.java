package garen.java.demo.demo07.day12.PersonDemo;

public class Person {

    private int age;
    private String name;

    private Person() {

    }

    // 多个构造方法是以重载的形式存在
    Person(int age) {
        this.age = age;
    }
    // 由于已经存在给姓名进行初始化的构造方法 ;因此只需要调用即可
    // 调用其他构造方法，需要通过this关键字来调用
    Person(int age, String name) {
        this(age);
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {
        System.out.println("name = " + name + "; age =" + age);
    }
}
