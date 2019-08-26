package garen.java.demo.demo12;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr;
        try {
            arr = new int[3];
            System.out.println(arr[4]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("发生了数组索引越界异常");

        } finally {
            arr = null;
        }
        System.out.println("Running Over");
    }
}
