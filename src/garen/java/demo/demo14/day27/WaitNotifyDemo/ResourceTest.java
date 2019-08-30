package garen.java.demo.demo14.day27.WaitNotifyDemo;

public class ResourceTest {
    public static void main(String[] args) {
        Resource rc = new Resource();
        InputThread in = new InputThread(rc);
        OutputThread out = new OutputThread(rc);

        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);

        t1.start();
        t2.start();
    }
}
