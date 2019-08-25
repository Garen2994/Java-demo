package garen.java.demo.demo11.day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "garen01");
        map.put(2, "garen02");
        map.put(3, "garen03");
        map.put(4, "garen04");
//        System.out.println(map);
//        System.out.println(map.remove(3));
//        System.out.println(map);
//
//        System.out.println(map.get(2));
//        System.out.println(map.get(3));
//
//        System.out.println(map.put(2, "newgaren02"));
//        System.out.println(map);

//        function();
//        function_1();
//        function_2();
        function_3();
    }

    public static void function() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        System.out.println(map);
        System.out.println(map.remove("d"));
        System.out.println(map.containsKey("b"));
        System.out.println(map.containsValue(4));

    }

    public static void function_1() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 11);
        map.put("b", 22);
        map.put("c", 33);
        map.put("d", 44);
        Set<String> set = map.keySet();
        Iterator<String> it = set.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Integer value = map.get(key);
            System.out.println(key + "..." + value);
        }
        System.out.println("=============");
        for (String key : set) {
            Integer value = map.get(key);
            System.out.println(key + "..." + value);
        }

    }

    public static void function_2() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("a", 11);
        map.put("b", 22);
        map.put("c", 33);
        map.put("d", 44);

        Set<Map.Entry<String, Integer>> set = map.entrySet();
        Iterator<Map.Entry<String, Integer>> it = set.iterator();
        while (it.hasNext()) {

            Map.Entry<String, Integer> entry = it.next();
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(entry);
            System.out.println(key + "..." + value);
        }
    }

    public static void function_3() {
        Map<Integer, Person> map = new HashMap<Integer, Person>();
        map.put(101, new Person("Garen01", 19));
        map.put(103, new Person("Garen02", 20));
        map.put(105, new Person("Garen03", 21));
        map.put(107, new Person("Garen04", 22));

        Set<Map.Entry<Integer, Person>> set = map.entrySet();
        Iterator<Map.Entry<Integer, Person>> it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<Integer, Person> entry = it.next();
            System.out.println(entry.getKey() + "..." + entry.getValue().getName() + " : " + entry.getValue().getAge());
        }


    }
}
