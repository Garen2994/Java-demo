package garen.java.demo.demo14.day26.ThreadDemo;


public class ThreadDemo {
    public static void main(String[] args) {
        MyThread mt = new MyThread("Garen_Thread");
        MyThread mt1 = new MyThread("Own_Thread");
        mt.run();
//        mt.setName("111");
        mt1.run();
        mt.start();
        mt1.start();   //有时是主线程在前执行 有时是新建线程在前
//        for (int i = 0; i < 10; i++) {
//            System.out.println("main thread is running " + i );
//        }
    }
}

