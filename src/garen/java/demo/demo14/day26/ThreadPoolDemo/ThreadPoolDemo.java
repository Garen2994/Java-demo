package garen.java.demo.demo14.day26.ThreadPoolDemo;

import garen.java.demo.demo14.day26.ThreadDemo.MyRunnable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {

        ExecutorService service = Executors.newFixedThreadPool(2);

        MyRunnable task = new MyRunnable();
        try{
            Thread.sleep(2000);
        }catch(InterruptedException ie){
            ie.printStackTrace();
        }
        service.submit(task);


        service.submit(task);
        service.submit(task);
        service.submit(task);

        service.submit(task);
        service.shutdown();


    }
}
