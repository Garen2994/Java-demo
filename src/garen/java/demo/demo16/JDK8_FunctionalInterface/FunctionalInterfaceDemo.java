package garen.java.demo.demo16.JDK8_FunctionalInterface;

public class FunctionalInterfaceDemo {
    public static void main(String[] args) {
        //使用匿名内部类重写抽象方法
//        show(new MyFunctionalInterface() {
//            @Override
//            public void method() {
//                System.out.println("Method is running!");
//            }
//        });
//
//        show(()->{
//            System.out.println("Method is running!");
//        });

        //最简化的Lambda表达式
        show(()-> System.out.println("Method is running"));
    }




    public static void show(MyFunctionalInterface myInter){
        myInter.method();
    }
}
