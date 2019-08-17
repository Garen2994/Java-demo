package garen.java.demo.demo07.day13.demo2;

public class Demo2Static {
    private String Name;
    private int age;

    //静态代码块
    static {
        System.out.println("静态代码块执行了！");
    }

    //构造代码块
    {
        System.out.println("构造方法执行了！");
    }

    public void method() {
        System.out.println("普通代码块执行了！");
    }
}
