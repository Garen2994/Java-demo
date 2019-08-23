package garen.java.demo.demo10.day18;

import java.util.ArrayList;
import java.util.Collection;

public class CollectionDemo {
    public static void main(String[] args) {
//        function_1();
        function_2();
    }
    private static void function() {

        Collection<String> coll = new ArrayList<String>();
        coll.add("Garen");
        coll.add("is");
        coll.add("a");
        coll.add("good");
        coll.add("man");
        Object[] objs = coll.toArray();
        for (Object obj : objs) {
            System.out.println(obj);
        }
    }
    private static void function_1(){
        Collection<String> coll = new ArrayList<String>();
        coll.add("Garen");
        coll.add("is");
        coll.add("a");
        coll.add("good");
        coll.add("man");
        System.out.println(coll.contains("good"));

    }
    private static void function_2(){
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc");
        coll.add("bcd");
        System.out.println(coll);

        coll.remove("abc");
        System.out.println(coll);

        coll.clear();
        System.out.println(coll);
    }

}
