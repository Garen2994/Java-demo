package garen.java.demo.demo07.day12.PersonSuperDemo;

public class Worker extends Person {
    Worker(String name,int age){
        super(name,age);
    }
    public void work(){
        System.out.println(this.getName() + " is working");
    }
}
