package garen.java.demo.demo13.day22;

import java.io.File;
import java.io.FileFilter;

public class MyFilter implements FileFilter {
    public boolean accept(File pathname){
        return pathname.getName().endsWith(".md");

    }
}
