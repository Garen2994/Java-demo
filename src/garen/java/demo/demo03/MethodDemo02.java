package garen.java.demo.demo03;

public class MethodDemo02 {
    public static void main(String[] args) {
        int sum1 = add(1, 2);
        int sum2 = add(1, 2, 3);
        double sum3 = add(1.1, 2.2);

        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
        System.out.println("sum3 = " + sum3);
    }

    // 方法的重载
    // 下面的方法实现了两个整数相加
    public static int add(int x, int y) {
        return x + y;
    }

    // 下面的方法实现了三个整数相加
    public static int add(int x, int y, int z) {
        return x + y + z;
    }

    // 下面的方法实现了两个小数相加
    public static double add(double x, double y) {
        return x + y;
    }
}


