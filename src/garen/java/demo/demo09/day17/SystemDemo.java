package garen.java.demo.demo09.day17;

import java.util.Arrays;

public class SystemDemo {
    public static void main(String[] args) {
//        function();
//        function_1();
//        function_2();
        function_3();
    }

    public static void function() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    public static void function_1() {
        while (true) {
            System.out.println("hello");
            System.exit(0);
        }
    }

    public static void function_2() {
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        new Person();
        System.gc();
        System.out.println(System.getProperties());
    }

    public static void function_3() {
        int[] src = {11, 22, 33, 44, 55, 66};
        int[] desc = {77, 88, 99};

        System.arraycopy(src, 1, desc, 1, 2);
        System.out.println(Arrays.toString(desc));
    }
}
