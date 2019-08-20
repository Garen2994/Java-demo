package garen.java.demo.demo09.day16;

import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        //把Date对象转换成String
        DateFormat df = new SimpleDateFormat("MM-dd-yyyy,HH-mm-ss");
        Date date = new Date(1607616000000L);
        String str_time = df.format(date);
        System.out.println(str_time);

        Calendar c = Calendar.getInstance();  //返回当前时间
        int year = c.get(Calendar.YEAR);
        System.out.println(year);
    }


}
