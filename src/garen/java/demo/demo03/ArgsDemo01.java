package garen.java.demo.demo03;

public class ArgsDemo01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 10;
        change(a, b);//调用方法时，传入的数值称为实际参数
        System.out.println("a=" + a);
        System.out.println("b=" + b);

        int[] arr = {1, 2, 3};
        change(arr);// 调用方法时，传入的数值称为实际参数
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void change(int a, int b) {//方法中指定的多个参数称为形式参数
        int temp = b;
        b = a;
        a = temp;
        System.out.println(a);
    }

    public static void change(int[] arr) {// 方法中指定的多个参数称为形式参数
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2;
        }
    }
}




