package garen.java.demo.demo16.JDK8_FunctionalInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class CommonFunctionalInterface {

    public static void main(String[] args) {
        //getString的方法参数是Supplier接口对象，生产一个字符串，可以用Lambda来传递字符串。
        getString(() -> "GOOD");
        consumerMethod("Garen", (s) -> {
            String upper_string = s.toUpperCase();
//            System.out.println(upper_string);
        });
        boolean check = predicateMethod("Garen", (s) -> {
            if (s.length() > 3)
                return true;
            else
                return false;
        });
//        System.out.println(check);

        String num = "123";
        String str = typeConvert(num, (s) -> Integer.parseInt(s) + 10, (i) -> i + "");
        System.out.println(str);
    }

    public static String getString(Supplier<String> sup) {
        return sup.get();
    }

    public static void consumerMethod(String s, Consumer<String> con1) {
        con1.accept(s);

    }

    public static boolean predicateMethod(String s, Predicate<String> pre1) {
//        System.out.println(pre1.test(s));
        return pre1.test(s);
    }

    public static String typeConvert(String s, Function<String, Integer> fun1, Function<Integer, String> fun2) {
        String str = fun1.andThen(fun2).apply(s); //自动拆箱
        return str;
    }
}

