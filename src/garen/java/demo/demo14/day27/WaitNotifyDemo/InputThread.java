package garen.java.demo.demo14.day27.WaitNotifyDemo;

public class InputThread implements Runnable {

    private Resource rc;

    public InputThread(Resource rc) {
        this.rc = rc;
    }

    @Override
    public void run() {
        int count = 0;
            while (true) {

                if (count == 0) {

                    rc.set("Garen", "Female");
                } else {

                    rc.set("Kim", "Male");
                }
                count = (count + 1) % 2; //让这两个交替输入
        }
    }
}
