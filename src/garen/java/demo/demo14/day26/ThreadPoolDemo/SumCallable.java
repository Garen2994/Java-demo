package garen.java.demo.demo14.day26.ThreadPoolDemo;

import java.util.concurrent.Callable;

public class SumCallable implements Callable {
    private int x;

    public SumCallable() {
    }

    public SumCallable(int x) {
        this.x = x;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        long start = System.currentTimeMillis();
        for (int i = 0; i < x; i++) {
            sum += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(Thread.currentThread().getName() + "is calculating ! " + "Runtime is :" + end + "-" + start +"=" +
                (end-start) + "ms");
        return sum;

    }
}
