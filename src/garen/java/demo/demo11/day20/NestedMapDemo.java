package garen.java.demo.demo11.day20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class NestedMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> javase = new HashMap<String, String>();
        HashMap<String, String> javaee = new HashMap<String, String>();

        javase.put("001", "garen01");
        javase.put("002", "garen02");

        javaee.put("001", "ariana01");
        javaee.put("002", "ariana02");

        HashMap<String, HashMap<String, String>> java = new HashMap<String, HashMap<String, String>>();
        java.put("Basic班", javase);
        java.put("Employ班", javaee);

        Set<Map.Entry<String, HashMap<String, String>>> set = java.entrySet();
        Iterator<Map.Entry<String, HashMap<String, String>>> it = set.iterator();

        while (it.hasNext()) {
            Map.Entry<String, HashMap<String, String>> mapEntry = it.next();
//            System.out.println(mapEntry);
//            System.out.println(mapEntry.getKey());
//            System.out.println(mapEntry.getValue());
            HashMap<String, String> value = mapEntry.getValue();
            Set<Map.Entry<String, String>> valueSet = value.entrySet();
            Iterator<Map.Entry<String, String>> valueIt = valueSet.iterator();

            while (valueIt.hasNext()) {
                Map.Entry<String, String> valueMap = valueIt.next();
                System.out.println(mapEntry.getKey() + "--" + valueMap.getKey()+ "--" +  valueMap.getValue());
            }
        }


    }
}
