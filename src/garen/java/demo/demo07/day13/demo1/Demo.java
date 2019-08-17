package garen.java.demo.demo07.day13.demo1;

public class Demo {
    public static void main(String[] args) {
        Zi z = new Zi();
        Zi z1 = new Zi();
        z.method1();
        z.method2();
        final int n = 20;
       //n = 30;  //赋值报错，final修饰的变量只能赋值一次
        z.num = 200;
        //z1.num = 300;
        System.out.println(z.num);//200
        System.out.println(z1.num);//200  多个对象共享同一个static成员变量
    }
}
