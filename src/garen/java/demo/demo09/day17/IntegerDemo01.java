package garen.java.demo.demo09.day17;

public class IntegerDemo01 {
    public static void main(String[] args) {

        Integer a = 500;
        Integer b = 500;
        Integer c = a;

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
    }
}
