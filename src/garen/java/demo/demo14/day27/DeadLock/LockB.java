package garen.java.demo.demo14.day27.DeadLock;

public class LockB {
    private LockB(){}
    public static final LockB lockb = new LockB();
}