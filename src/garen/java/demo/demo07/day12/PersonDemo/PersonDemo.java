package garen.java.demo.demo07.day12.PersonDemo;

public class PersonDemo {
    public static void main(String[] args) {

        Person p1 = new Person(23, "Garen");

        String name =p1.getName();
        System.out.println(name);
       // p1.setAge(24);
        int age =p1.getAge();
        System.out.println(age);
//        p1.speak();

//        Person p2 = new Person(25);
//        int age2 = p2.getAge();
//        System.out.println(age2);

    }

}
