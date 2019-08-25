package garen.java.demo.demo11;

/*
 *  JDK1.5新的特性,方法的可变参数
 *  前提: 方法参数数据类型确定,参数的个数任意
 *  可变参数语法: 数据类型...变量名
 *  可变参数,本质就是一个数组
 */
public class VariedArgumentsDemo {
    public static void main(String[] args) {

        int sum = getSum(5,24,12);
        System.out.println(sum);
    }

    public static int getSum(int... a) {
        int sum = 0;
        for (int i : a) {
            sum = sum + i;
        }
        return sum;
    }

}
