package garen.java.demo.demo10.day18;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class IteratorDemo {
    public static void main(String[] args) {
        Collection<String> coll = new ArrayList<String>();
        coll.add("abc1");
        coll.add("abc2");
        coll.add("abc3");
        coll.add("abc4");
        coll.add("abc5");

        Iterator it = coll.iterator();
        while (it.hasNext()) {
//        System.out.println(it.hasNext());
            String str = (String) it.next();
            System.out.println(str);
        }

//        for (Iterator<String> it2 = coll.iterator();it2.hasNext();){
//            System.out.println(it2.next());
//        }
    }

}


