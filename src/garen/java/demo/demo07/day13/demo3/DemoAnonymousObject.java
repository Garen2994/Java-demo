package garen.java.demo.demo07.day13.demo3;


public class DemoAnonymousObject {
    public static Person01 getPerson(){
//        Person01 p = new Person01();
//        return p;
        return new Person01();
    }
    public static void method(Person01 p1){
        System.out.println("Age : " + p1.getAge());
        System.out.println("Name : " + p1.getName());
    }
}
