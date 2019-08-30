package garen.java.demo.demo14.day26.ThreadPoolDemo;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/*
 * 用Callables实现异步计算数 分别求和，并通过Future返回结果*/
public class CallablePractice {
    public static void main(String[] args) throws Exception{
        ExecutorService service = Executors.newFixedThreadPool(2);
        SumCallable sumcall = new SumCallable(1000010);

        Future<Integer> result = service.submit(sumcall);

        Integer sum = result.get();
        System.out.println("sum = " + sum);

        Future<Integer> result2 = service.submit(new SumCallable(200));
        System.out.println("sum1 = " + result2.get());

    }
}
