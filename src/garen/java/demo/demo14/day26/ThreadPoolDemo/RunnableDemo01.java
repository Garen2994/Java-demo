package garen.java.demo.demo14.day26.ThreadPoolDemo;

public class RunnableDemo01 {
    public static void main(String[] args) {

        //匿名内部类来实现Runnable接口
        Runnable r = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 40; i++) {
                    System.out.println("New Thread is running" + i);
                }
            }
        };
        Thread t1 = new Thread(r);
        t1.start();

        //匿名内部类
        new Thread() {
            @Override
            public void run() {
//                super.run();
                for (int i = 0; i < 20; i++) {
                    System.out.println("Another Thread is running" + i);
                }
            }
        }.start();
    }
}
