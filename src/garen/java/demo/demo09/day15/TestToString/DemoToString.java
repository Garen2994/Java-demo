package garen.java.demo.demo09.day15.TestToString;

public class DemoToString {
    public static void main(String[] args) {
        Person p = new Person("Garen",18);

        //调用Person类的方法toString()
        String str = p.toString();

        System.out.println(p);//输出语句中,写的是一个对象,默认调用对象的toString方法
        System.out.println(str);

    }
}
