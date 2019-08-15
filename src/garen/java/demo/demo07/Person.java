package garen.java.demo.demo07;

public class Person {

    private int age;
    private String name;

    Person(int a, String nm) {
        age = a;
        name = nm;
    }

    public void speak() {
        System.out.println("name = " + name + ",age" + age);
    }
}
