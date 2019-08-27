package garen.java.demo.demo12;

public class ThrowDemo {
    public static void main(String[] args) {
        int[] arr = {11,22,33,44,55,66,77};
        int[] arr1 = {};

        int num = ArrayTools.getElement(arr,2);
        System.out.println(num);
//        int num1 = ArrayTools.getElement(null,2);
//        System.out.println(num1);
//        int num2 = ArrayTools.getElement(arr,9);
//        System.out.println(num2);
//        int num3 = ArrayTools.getElement(arr1,0);
        System.out.println(arr1.length);
    }


}
