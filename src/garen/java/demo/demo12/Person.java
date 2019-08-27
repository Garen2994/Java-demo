package garen.java.demo.demo12;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {

        if (age < 0 || age >= 200){

            throw new NoAgeException(age + "is illegal age");
        }

        this.name = name;
        this.age = age;
    }

    public String toString() {
        return "Person[name = " +name+",age = "+ age+" ]";
    }
}
