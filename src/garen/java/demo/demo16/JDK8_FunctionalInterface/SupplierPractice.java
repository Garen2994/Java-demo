package garen.java.demo.demo16.JDK8_FunctionalInterface;

import java.util.function.Supplier;

/*
 * 练习：求数组的最大值
 * 使用Supplier接口作为方法参数类型，通过Lambda表达式求出数组最大值
 * 使用泛型Integer完成
 */
public class SupplierPractice {
    public static void main(String[] args) {
        int[] arr = {23, 45, 69, 78, 47, 12, 3};
        int maxValue = getMax(() -> {
            int max = arr[0];
            for (int i : arr) {
                if (i > max) {
                    max = i;
                }
            }
            return max;
        });
        System.out.println("Max value is: " + maxValue);
    }

    public static int getMax(Supplier<Integer> sup) {
        return sup.get();
    }
}
