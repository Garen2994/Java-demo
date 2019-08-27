package garen.java.demo.demo12;

public class ExceptionDemo {
    public static void main(String[] args) {
        int[] arr = null;

        try {
            if(arr == null){
                throw new NullPointerException("发生了数组指向为空的异常");
            }
//            int num = ArrayTools.getElement(null, 2);
//
//            System.out.println(arr[9]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println(e.getMessage());

            System.out.println("发生了数组索引越界异常");

        } catch (NullPointerException e1)
        {
            System.out.println(e1.getMessage());  //Throwable类的方法们
            System.out.println(e1.toString());
            System.out.println("=====================printStackTrace信息=======================");
            e1.printStackTrace();
//            System.out.println("发生了数组指向为空的异常");
        }finally {
            arr = null;
            System.out.println("Array is released");
        }
        System.out.println("Running Over");
    }
}
