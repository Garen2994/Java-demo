package garen.java.demo.demo12;

public class TestMyException {
    public static void main(String[] args) {
        try {

            Person p = new Person("Adam", 201);
//            if (...) {
//            throw new NoAgeException("Age is illegal!");
//            }

        } catch (NoAgeException n) {
            System.out.println("Age is illegal!");
        }
        System.out.println("over");
    }
}
