package garen.java.demo.demo07.day12.PersonSuperDemo;

public class Student extends Person{

    Student(String name , int age){
        super(name, age);
    }
    public void study(){
        System.out.println(this.getName() + " is studying");
    }

}
