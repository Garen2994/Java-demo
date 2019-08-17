package garen.java.demo.demo07.day13.demo3;


public class Test {
    public static void main(String[] args) {
        Person01 person = DemoAnonymousObject.getPerson();
        System.out.println(person.getAge());
        System.out.println(person.getName());

        DemoAnonymousObject.method(person);
        //DemoAnonymousObject.method(new Person01());

    }
}
