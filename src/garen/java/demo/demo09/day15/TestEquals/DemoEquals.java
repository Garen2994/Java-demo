package garen.java.demo.demo09.day15.TestEquals;

public class DemoEquals {
    public static void main(String[] args) {

        Person p1 = new Person("Garen",20);
        Person p2 = new Person("Ariana",26);

        System.out.println(p2.equals(p2));//比较对象属性值

    }
}
