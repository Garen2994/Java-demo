package garen.java.demo.demo14;

public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread("Garen_Thread");
        mt.start();   //有时是主线程在前执行 有时是新建线程在前
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread is running " + i );
        }
    }
}
