package garen.java.demo.demo16.JDK8_FunctionalInterface;

import java.util.function.Consumer;

public class AndThenPractice {
    public static void main(String[] args) {
        String[] arr = {"Garen,女", "Skylar,女", "Ed,男"};
        printInfo(arr, (s) -> {
            //切割出姓名
            String name = s.split(",")[0];
            System.out.println("Name : " + name);

        }, (s) -> {
            //切割出性别
            String gender = s.split(",")[1];
            System.out.println("Gender : " + gender);
        });
    }

    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String s : arr) {
            con1.andThen(con2).accept(s);
        }
    }
}
