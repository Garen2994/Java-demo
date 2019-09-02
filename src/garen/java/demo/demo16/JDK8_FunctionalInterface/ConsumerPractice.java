package garen.java.demo.demo16.JDK8_FunctionalInterface;

import java.util.function.Consumer;

public class ConsumerPractice {
    public static void main(String[] args) {
        method("Garen",(String name)->{
            String reverse_name = new StringBuilder(name).reverse().toString();
            String sub_name = new  StringBuilder(name).substring(2).toString();
            System.out.println(reverse_name);
            System.out.println(sub_name);
        });
    }

    public static void method(String name, Consumer<String> cm){
        cm.accept(name);

    }
}
