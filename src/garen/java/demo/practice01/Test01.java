package garen.java.demo.practice01;

/*
    奇数求和练习(easy)
    分析：
    为了记录累加和的值，我们需要定义一个存储累加和的变量
    我们要获取到1-100范围内的数
    判断当前数是否为奇数，是奇数，完成累加和操作
    累加完毕后，最终显示下累加和的值

 */
public class Test01 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {

                sum += i;
//              System.out.println(i);
            }
        }
        System.out.println("1-100中所有奇数和为：" + sum);
    }
}
