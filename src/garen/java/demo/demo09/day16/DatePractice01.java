package garen.java.demo.demo09.day16;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DatePractice01 {
    /*
     * 求出自己已经出生多少天
     * 1.获取当前时间对应的天数
     * 2.获取自己出生日期对应的天数
     * 3.两个时间相减（当前时间天数 – 出生日期天数）
     */
    public static void main(String[] args) throws Exception {
        Calendar my = Calendar.getInstance();
        Calendar c = Calendar.getInstance();
        System.out.println("Today is " + c.get(Calendar.YEAR) + "-" + (c.get(Calendar.MONTH) + 1) + "-" + c.get(Calendar.DATE));
        function();

    }

    public static void function() throws Exception {

        System.out.println("Input the date of birth (format:YYYY-MM-dd)");
        String birth = new Scanner(System.in).next();
        //将字符串日期转换
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birth);
        Date todayDate = new Date();

        long birthdaySecond = birthdayDate.getTime();
        long todaySecond = todayDate.getTime();
        long count_days = todaySecond - birthdaySecond;

        if (count_days < 0) {
            System.out.println("还没出生呢!");
        } else {
            System.out.println("已经存活的天数 ： " + count_days / 1000 / 60 / 60 / 24);//毫秒值换算成天数
        }
    }
}
