package garen.java.demo.demo09.day17;

import java.math.BigInteger;
import java.util.ArrayList;
/*
1.用循环实现不死神兔
    故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契。
    在他的一部著作中提出了一个有趣的问题：假设一对刚出生的小兔一个月后就能长成大兔，
    再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，一年内没有发生死亡，
    问：一对刚出生的兔子，一年内繁殖成多少对兔子?

    1 1 2 3 5 8 13 21

2.第100个月繁殖多少对兔子?(利用BigInteger完成)
*/

public class HomeWork1 {
    public static void main(String[] args) {
        ArrayList<BigInteger> array = new ArrayList<BigInteger>();
        BigInteger b1 = new BigInteger("1");
        array.add(b1);//第一个月 1对
        BigInteger b2 = new BigInteger("1");
        array.add(b2);

        int n = 100;
        for (int i = 2; i <= n; i++) {
            BigInteger a = array.get(i-1);
            BigInteger b = array.get(i-2);
            BigInteger c = a.add(b);
            array.add(c);
        }
        System.out.println("第" + n + "月" + "共有 " + array.get(n) + " 对兔子");

     }
}

