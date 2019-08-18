package garen.java.demo.demo07.day13.demo5;

public class Demo {

    public static void main(String[] args) {


        /*匿名内部类,简化问题:  定义实现类,重写方法,建立实现类对象,合为一步完成
         * 1.匿名内部类在创建对象时，只能使用一次。
         * 2.匿名对象在调用方法时，只能调用一次。
         */
        //省略了类名，也是匿名对象。
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类的重写方法1运行啦！");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类的重写方法2运行啦！");

            }
        }.method1();
        new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类的重写方法1运行啦！");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类的重写方法2运行啦！");

            }
        }.method2();


        MyInterface obj = new MyInterface() {
            @Override
            public void method1() {
                System.out.println("匿名内部类的重写方法1运行啦！");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类的重写方法2运行啦！");

            }
        };
        obj.method1();
        obj.method2();

    }
}
