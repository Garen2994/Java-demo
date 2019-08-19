package garen.java.demo.demo07.day13.demo6;

public class DemoPerson {
    public static void main(String[] args) {
        Person p = new Person();
        System.out.println("The ID is " + Person.id);

        Person p1 = new Person(23);
        Person p2 = new Person("Garen",18);
        Person p3 = new Person("Ariana");


    }
}
