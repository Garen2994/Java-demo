package garen.java.demo.demo07.day13.demo2;

public class Demo2StaticMethod {
    int num = 100;
    static int number = 1000;

    public static void main(String[] args) {
        MyClass mc = new MyClass();
        mc.method();
        mc.methodStatic();
        MyClass.methodStatic();//推荐使用此方式 类名称.静态方法名


        myMethod(); //本类中的静态方法可以省略类名
        Demo2StaticMethod.myMethod();    //与上一条语句等效
    }
    public static void myMethod(){
        System.out.println("This is my own method !");

    }
}
