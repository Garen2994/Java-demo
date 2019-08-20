package garen.java.demo.demo09.day16;

import java.util.Arrays;

public class RegexDemo {
    public static void main(String[] args) {
        String str = "ghjcb";
        String str1 = "13104413672";
//        System.out.println(str.matches("[0-9]{6,12}"));
//        System.out.println(str1.matches("1[34578][0-9]{9}"));
//        System.out.println(str.matches("[^abcd]*b"));
        //matches() 匹配
        String qq = "1218643895";
        System.out.println(qq.matches("[1-9][0-9]{4,14}"));

        String phone = "13104413672";
        System.out.println(str1.matches("1[34578][0-9]{9}"));

        //split() 分割
        String code = "18 95  35   20";
        String[] result = code.split(" +");//分割后是字符串数组
        System.out.println(Arrays.toString(result));

        String addr = "47..124....256.97";
        String[] num = addr.split("\\.+");
        System.out.println(Arrays.toString(num));

        //replaceAll()
        String before = "Garen and you are123totally a great one";
        String after = before.replaceAll("[0-9]+"," ").replaceAll("and you are","is");
        System.out.println(after);

    }
}
