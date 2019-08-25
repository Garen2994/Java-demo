package garen.java.demo.demo11.day20;

import java.util.HashMap;

public class NestedMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> javase = new HashMap<String, String>();
        HashMap<String, String> javaee = new HashMap<String, String>();

        javase.put("001","garen01");
        javase.put("002","garen02");

        javaee.put("001","ariana01");
        javaee.put("002","ariana02");

        HashMap<String,HashMap<String,String>> java = new  HashMap<String,HashMap<String,String>>();



    }
}
