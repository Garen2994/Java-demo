package garen.java.demo.demo09.day17;

import java.util.Arrays;

public class ArraysDemo {
    public static void main(String[] args) {

        int[] arr = {56,12,20,98,77,43,62,81};
        Arrays.sort(arr);
        int[] newArray = new int[3];
        System.arraycopy(arr,(arr.length-3),newArray,0,3);
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(newArray));
        int index = Arrays.binarySearch(arr,77);
        System.out.println(index);
    }
}
