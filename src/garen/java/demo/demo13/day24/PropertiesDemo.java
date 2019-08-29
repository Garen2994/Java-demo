package garen.java.demo.demo13.day24;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;
import java.util.Set;

public class PropertiesDemo {
    public static void main(String[] args) throws IOException {
        Properties prop = new Properties();
        prop.setProperty("Garen", "勒勒");
        prop.setProperty("Dianel", "彦祖");
        prop.setProperty("Kim", "林");

        FileWriter out = new FileWriter("prop.properties");
        prop.store(out,"save data");

        out.close();
/*        Set<String> keys = prop.stringPropertyNames();
        for (String key : keys) {
            String value = prop.getProperty(key);
            System.out.println(key + " " + value);*/

        }
    }

