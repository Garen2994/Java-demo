package garen.java.demo.demo14.day26.ThreadPoolDemo;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CallableDemo {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        MyCallable mycall = new MyCallable();
        service.submit(mycall);
        service.submit(mycall);
        service.submit(mycall);

        service.shutdown();


    }
}
