package garen.java.demo.demo14.day26.ThreadDemo;

public class RunnableDemo {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        Thread t2 = new Thread(new MyRunnable());
        t.run();
        t.start();

    }
}
