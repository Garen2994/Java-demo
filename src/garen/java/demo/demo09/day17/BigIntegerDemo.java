package garen.java.demo.demo09.day17;

import java.math.BigDecimal;
import java.math.BigInteger;

public class BigIntegerDemo {
    public static void main(String[] args) {
        function();
    }
    /*BigInteger类的构造方法
 传递字符串,要求数字格式,没有长度限制
  */
    public static void function(){
        BigInteger b = new BigInteger("8465846668464684562385634168451684568645684564564");
        System.out.println(b);
        BigInteger b1 = new BigInteger("5861694569514568465846668464684562385634168451684568645684564564");
        System.out.println(b1);
//        System.out.println(b.multiply(b1));
//        System.out.println(b.add(b1));
//        System.out.println(b.max(b1));//返回二者之间大值
//        System.out.println(b.subtract(b1));
//        System.out.println(b1.divide(b));
        BigDecimal bd = new BigDecimal("100.2364567984154612454975");
        BigDecimal bd2 = new BigDecimal("10.232345364567984154612454975");

        BigDecimal newBD = bd.divide(bd2 , 10 , BigDecimal.ROUND_UP);
        System.out.println(newBD);

    }
}
