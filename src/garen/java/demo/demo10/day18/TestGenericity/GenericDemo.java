package garen.java.demo.demo10.day18.TestGenericity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

public class GenericDemo {
    public static void main(String[] args) {


        ArrayList<String> array = new ArrayList<String>();
        HashSet<Integer> set = new HashSet<Integer>();

        array.add("abc1");
        array.add("abc2");
        array.add("abc3");

        set.add(123);
        set.add(234);
        set.add(345);

        iterator(array);
        iterator(set);
    }
    public static void iterator(Collection<?> coll){
        Iterator<?> it = coll.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
