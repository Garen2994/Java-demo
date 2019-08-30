package garen.java.demo.demo14.day27.DeadLock;

public class LockA {
    private LockA(){
    }
    public  static final LockA locka = new LockA();
}
