package garen.java.demo.demo17;

import java.util.*;
import java.util.stream.Stream;

public class StreamInterfaceDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        Stream<String> stream = list.stream();

        Map<String, String> map = new HashMap<>();
        map.put("1","Garen01");
        map.put("2","Garen02");
        map.put("3","Garen03");
        map.put("4","Garen04");


        Set<String> keySet = map.keySet();
        Stream<String> stream1 = keySet.stream();

        Stream<String> stream2 = map.values().stream();

        Set<Map.Entry<String, String>> entry_set = map.entrySet();
        Stream<Map.Entry<String, String>> stream3 = entry_set.stream();
        stream1.forEach(System.out::println);
        stream2.forEach(System.out::println);
        stream3.forEach(System.out::println);

        Integer[] arr = {12,25,68,78,95,45};
        Stream<Integer> arr_stream = Stream.of(arr);
        System.out.println(arr_stream);
        arr_stream.forEach(System.out::println); //::双冒号是方法引用

    }
}
