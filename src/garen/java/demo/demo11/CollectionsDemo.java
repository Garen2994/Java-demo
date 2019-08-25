package garen.java.demo.demo11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class CollectionsDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("ewrew");
        list.add("qwesd");
        list.add("Qwesd");
        list.add("bv");
        list.add("wer");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);

        int index = Collections.binarySearch(list,"bv");
        System.out.println(index);

        Collections.sort(list);
        System.out.println(list);

    }

}
