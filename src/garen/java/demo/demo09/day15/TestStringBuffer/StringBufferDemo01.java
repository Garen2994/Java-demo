package garen.java.demo.demo09.day15.TestStringBuffer;

/*
 * int[] arr = {34,12,89,68};将一个int[]中元素转成字符串
 * 格式 [34,12,89,68]
 * String s = "["
 * 数组遍历
 * s+= arr[i];
 * s+"]"
 * StringBuffer实现,节约内存空间, String + 在缓冲区中,append方法
 */
public class StringBufferDemo01 {
    public static void main(String[] args) {
        int[] arr = {34, 12, 86, 98};
        System.out.println(toString(arr));
//      System.out.println((toString(arr)).length());
/*
        //StringBuilder类 线程不安全，但效率高

        StringBuilder builder = new StringBuilder();
        builder.append("aaa");
        System.out.println(builder);
        System.out.println(builder.length());*/
    }

    public static String toString(int[] array) {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[");

        for (int i = 0; i < array.length; i++) {

            if(i == array.length-1){
                buffer.append(array[i]).append("]");
            }else{
                buffer.append(array[i]).append(",");
            }
        }
        return buffer.toString();

    }

}
