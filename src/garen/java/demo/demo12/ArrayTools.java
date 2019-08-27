package garen.java.demo.demo12;

public class ArrayTools {
    public static int getElement(int[] arr,int index){

        if(arr==null){
            throw new NullPointerException("Wrong！arr points a null！！");
        }
        if (index < 0 || index >= arr.length){
            throw new ArrayIndexOutOfBoundsException("The index is out of bounds of this array!");
        }
        int element = arr[index];
        return element;
    }
}
