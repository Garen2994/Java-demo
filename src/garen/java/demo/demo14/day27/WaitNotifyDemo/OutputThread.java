package garen.java.demo.demo14.day27.WaitNotifyDemo;

public class OutputThread implements Runnable{
    private Resource rc;

    public OutputThread(Resource rc) {
        this.rc = rc;

    }
    @Override
    public void run() {
        while(true){
            rc.out();
        }
    }
}
