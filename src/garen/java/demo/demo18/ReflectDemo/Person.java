package garen.java.demo.demo18.ReflectDemo;

public class Person {
    public String name;
    public int age;
    private int a;
    private String id;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {

        return "Name : " + name + " Age : " + age;
//        return super.toString();
    }

    public void eat(){
        System.out.println("xxx is eating");
    }
    public void eat(String food){
        System.out.println("Eat " + food);
    }
}
