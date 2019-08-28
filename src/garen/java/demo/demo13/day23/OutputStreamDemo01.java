package garen.java.demo.demo13.day23;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

public class OutputStreamDemo01 {
    public static void main(String[] args) {
        //try 外面声明变量,try 里面建立对象
        FileOutputStream fos = null;
        try{
            fos = new FileOutputStream("F:\\AC.txt");
            fos.write(100);
        }catch(IOException ex){
            System.out.println(ex);
            throw new RuntimeException("文件写入失败,重试");
        }finally{
            try{
                if(fos!=null)
                    fos.close();
            }catch(IOException ex){
                throw new RuntimeException("关闭资源失败");
            }
        }
    }
}