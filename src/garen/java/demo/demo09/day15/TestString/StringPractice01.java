package garen.java.demo.demo09.day15.TestString;

/*
 *  将字符串的首字母转成大写,其他内容转成小写
 *  思想:
 *    获取首字母, charAt(0)  substring(0,1)
 *    转成大写 toUpperCase()
 *
 *    获取剩余字符串, substring(1)  toLowerCase()
 */
public class StringPractice01 {
    public static void main(String[] args) {
        String str = "aBc5%4dEF";
        System.out.println("The origin string is "+ str);
        String newstr = toConvert(str);
        System.out.println("After converting : " + newstr);
    }

    public static String toConvert(String str) {
        //定义变量保存首字母和剩余部分
        String first = str.substring(0, 1);
        first = first.toUpperCase();
        String after = str.substring(1);
        after = after.toLowerCase();

        return first + after;
    }
}
