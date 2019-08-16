package garen.java.demo.demo07.day12.PersonSuperDemo;

public class Test {
    public static void main(String[] args) {
        Student stu = new Student("Garen", 19);
        stu.study();
        int age1 = stu.getAge();
        System.out.println(age1);

        Worker w = new Worker("Tang", 30);
        w.work();
        int age2 = w.getAge();
        System.out.println(age2);
    }
}
