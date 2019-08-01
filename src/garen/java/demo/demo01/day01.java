package garen.java.demo.demo01;

import java.util.Arrays;

public class day01 {
    public static void main(String[] args) {
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++)
            a[i] = i;
//      for (int i = 0; i < a.length; i++)  //general output
//          System.out.println(a[i]);
        for (int element : a)             //for each loop output
            System.out.println(element);
        System.out.println(Arrays.toString(a)); //class Arrays toString() output
        int[] b = new int[]{2, 5, 3, 9, 7, 17, 13, 11, 19};//静态初始化

        int[] copied_b = Arrays.copyOf(b, 2 * b.length); //copy array
        System.out.println(Arrays.toString(copied_b));

        int[][] aa = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for (int[] row:aa)    //output 2-D array
            for (int value:row)
                System.out.println(value);
        System.out.println(Arrays.deepToString(aa)); //quick output
    }
}
