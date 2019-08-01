package garen.java.demo.demo02;

import java.util.Random;
import java.util.Scanner;

/*
    猜数字小游戏

    完成猜数字小游戏：
    1、产生随机数
    后台预先生成一个随机数1-100，用户键盘录入猜数字
    2、通过if语句对用户猜的数与随机数进行比较
    如果猜对了，打印“恭喜您，答对了”
    如果猜错了
    猜大了：打印“sorry，您猜大了!”
    猜小了：打印“sorry，您猜小了!”
    3、通过for循环完成用户猜数的循环
    直到数字猜到为止
    最多只能猜5次，否则提示“sorry，您没有机会了!”

*/
public class GuessNumber {
    public static void main(String[] args) {

        Random ran = new Random();
        int num = ran.nextInt(100);
        //System.out.println(num);

        System.out.println("Input the number you guessed!");

        for (int time = 1; time <= 5; time++) {
            Scanner sc = new Scanner(System.in);
            int guess = sc.nextInt();
            if (num == guess) {

                System.out.println("Congratulation! You are right!");
                break;

            } else if (num < guess)

                System.out.println("Sorry,It's too large");

            else

                System.out.println("Sorry!It's too small");

            if (time == 5){
                System.out.println("Sorry!You have no chance.");
                break;
            }
            System.out.println("You have "+ (5-time) +" times to try");
        }

    }
}

