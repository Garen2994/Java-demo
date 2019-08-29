package garen.java.demo.demo14;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread("Garen_Thread");
        mt.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main thread is running " + i );
        }
    }
}
