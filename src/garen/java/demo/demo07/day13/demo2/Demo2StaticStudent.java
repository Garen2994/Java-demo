package garen.java.demo.demo07.day13.demo2;

public class Demo2StaticStudent {
    public static void main(String[] args) {
        Student.room = "J305";

        Student one = new Student("Garen",18);
        System.out.println("Name : " + one.getName());
        System.out.println("Age : " + one.getAge());
        System.out.println("Room : " + Student.room);
        System.out.println("==================");

        Student two = new Student("Ariana",24);
        System.out.println("Name : " + two.getName());
        System.out.println("Age : " + two.getAge());
        System.out.println("Room : " + Student.room);


    }
}
