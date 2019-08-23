package garen.java.demo.demo10.day19.ListDemo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<String>();
        link.add("abc1");
        link.add("abc2");
        link.add("abc3");
        link.add("abc4");
        link.add("abc5");

        String first = link.removeFirst();
        String last = link.removeLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(link);

        System.out.println(link.getFirst());
        System.out.println(link.getLast());
        link.addFirst("adc1");
        link.addLast("adc5");

//        System.out.println(link.isEmpty());
        System.out.println(link);
    }
}
