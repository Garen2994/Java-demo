package garen.java.demo.demo13.day22.RecursionPractice;
/*
 * 1+2+3+...+(n-1)+n:求1到n的和
 * 总结规律：1到n的和等于1到(n-1)的和再加n
 * getSum(n-1)+ n
 * 递归出口：getSum(1) return 1;
 *
 */

public class SumDemo {

    public static void main(String[] args) {

        int n = 4;
        System.out.println("1..." + n + "的和 " + getSum(n));
        System.out.println(n + " != "  +getMulti(n));

    }

    public static int getSum(int n) {

        if (n == 1)
            return 1;
        return getSum(n - 1) + n;
    }

    public static int getMulti(int n) {

        if (n == 1)
            return 1;
        return getMulti(n - 1) * n;
    }
}
