package garen.java.demo.demo16.JDK8_FunctionalInterface;
/*
 * Predicate接口中的and() 也是使用&&将两个判断条件连接起来的
 * or()
 */

import java.util.function.Predicate;

public class PredicatePractice {
    public static void main(String[] args) {
        String str = "Garen is real";
        boolean check = checkString(str, (pre1) -> {
                    return str.length() > 5;
                }, (pre2) -> {
                    return str.endsWith("l");
                }
        );
        System.out.println(check);
    }

    public static boolean checkString(String s, Predicate<String> pre1, Predicate<String> pre2) {
//        return pre1.test(s) && pre2.test(s);
        //&& 与关系 -> and()
//
//        return pre1.and(pre2).test(s);

        //|| 或关系 —> or()
//        return pre1.or(pre2).test(s);
        // ! -> negate() 取反
        return pre1.negate().test(s);

    }
}
