package garen.java.demo.demo14.day26.ThreadPoolDemo;

import java.util.concurrent.Callable;

public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        System.out.println("Need a nap!");
        try {
            Thread.sleep(2000);//线程休眠2秒
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()  + " is running");
//        System.out.println();
        return null;
    }
}
