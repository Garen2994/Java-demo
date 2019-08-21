package garen.java.demo.demo09.day17;

public class IntegerDemo {

    public static void main(String[] args) {
        int i = Integer.parseInt("110", 2);// 前面的数字是二进制的,但是方法parseInt运行结果都是十进制
        System.out.println(i);

        int num = 2;
        String s = num + "";
        System.out.println(s + 1);
        String s1 = Integer.toString(2675, 16);
        System.out.println(s1);
//        function();
//        function_1();
        function_2();
    }

    public static void function() {
        Integer in = 100;
        int i = in.intValue();
        System.out.println(--i);//99
    }

    public static void function_1() {

        System.out.println(Integer.toBinaryString(99));
        System.out.println(Integer.toOctalString(99));
        System.out.println(Integer.toHexString(99));
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

    }

    public static void function_2() {

        Integer in = 1;
        System.out.println(in + 1);//自动拆箱 自动装箱 等同于in.inValue()+1
    }
}

