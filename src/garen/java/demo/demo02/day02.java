package garen.java.demo.demo02;

import java.util.Random;
import java.util.Scanner;

public class day02 {
    public static void main(String[] args) {
        Random ran = new Random();
        int i = ran.nextInt(1000);//范围1-1000

        System.out.println(i);
        Scanner sc = new Scanner(System.in);

        int enterNum = sc.nextInt();
        System.out.println("输入的整数为" + enterNum);

        int k = i > enterNum ? i : enterNum;  //三元运算符
        System.out.println(k + "是最大的值");

        String enterString = sc.next();
        System.out.println("输入的字符串" + enterString);

        for (int j = 0; j < 10; j++) {
            if (j > 5) {
                break;
            }

            System.out.println("我爱Java" + j);
        }
        for (int n = 0; n < 10; n++) {
            if (n % 2 == 0) {
                continue;
            }
            System.out.println(n);
        }
    }
}

