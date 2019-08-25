package garen.java.demo.demo11.day20;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;

public class LinkedHashMapDemo {
    public static void main(String[] args) {
        Hashtable<String, String> link = new Hashtable<String, String>();
        link.put("a","a101");
        link.put("b","b101");
        link.put("c","c101");
        link.put("d","d101");
        link.put(null,null);
        System.out.println(link);

    }
}
