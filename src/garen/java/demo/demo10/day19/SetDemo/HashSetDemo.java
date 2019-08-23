package garen.java.demo.demo10.day19.SetDemo;


import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("garen01");
        hs.add("garen02");
        hs.add("garen03");
        hs.add("garen04");
        hs.add("garen03");

        System.out.println(hs.toString());
        for (String h : hs) {
            System.out.println(h);
        }
        System.out.println("==============");
        Iterator<String> it = hs.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }


        Person p1 = new Person();
        int h1 = p1.hashCode();

        Person p2 = new Person();
        int h2 = p2.hashCode();

        System.out.println(h1);
        System.out.println(h2);
        System.out.println(h1 == h2);

        String a1 = "abc";
        String a2 = "abc";
/*      System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());
        System.out.println(a1.hashCode() == a2.hashCode());*/
        hs.add(a1);
        hs.add(a2);
        hs.add("重地");
        hs.add("通话");
        hs.add("abc");
        it = hs.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

}
