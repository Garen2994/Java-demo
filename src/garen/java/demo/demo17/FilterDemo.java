package garen.java.demo.demo17;

import java.util.ArrayList;
import java.util.List;

public class FilterDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("Garen");
        list.add("Skylar");
        list.add("Gary");
        list.add("Green");
        list.add("Ariana");
        list.add("Alan");
        list.add("Alexander");
        list.add("Amy");
        list.add("Armstrong");
        list.add("Stan");

/*        List<String> A_list = new ArrayList<>();
        for (String s : list) {
            if (s.startsWith("A"))
                A_list.add(s);
        }

        List<String> long_A_list = new ArrayList<>();
        for (String s : A_list) {
            if(s.length() > 5)
                long_A_list.add(s);
        }
        for (String s : long_A_list) {
            System.out.println(s);
        }
    */

        //使用Stream流 输出同样的结果
        long count = list.stream()
                .filter(s->s.startsWith("A")) //筛选"A"开头名字
                .filter(s->s.length() > 5) //筛选"A"开头中超过5个字母的名字
//                .forEach(System.out::println);//逐个打印
                .count();
        System.out.println(count);
        }
}
