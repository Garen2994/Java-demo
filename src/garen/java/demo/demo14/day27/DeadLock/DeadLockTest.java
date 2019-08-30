package garen.java.demo.demo14.day27.DeadLock;


public class DeadLockTest {
    public static void main(String[] args) {
        DeadLockDemo dead = new DeadLockDemo();
        Thread t0 = new Thread(dead);
        Thread t1 = new Thread(dead);
        t0.start();
        t1.start();
    }
}