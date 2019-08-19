package garen.java.demo.demo09.day15.TestString;

/*
 * 获取指定字符串中，大写字母、小写字母、数字的个数。
 * 思想:
 *   1. 计数器,就是int变量,满足一个条件 ++
 *   2. 遍历字符串, 长度方法length() + charAt() 遍历
 *   3. 字符判断是大写,是小写,还是数字
 */
public class StringPractice {
    public static void main(String[] args) {
        getCount("A%3Ghjl&7FFy");
    }

    public static void getCount(String str) {
        int upper = 0;
        int lower = 0;
        int digit = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            //利用ASCII码 65-90 97-122 48-57
            if (c >= 'A' && c <= 'Z')
                upper++;
            else if (c >= 'a' && c <= 'z')
                lower++;
            else if (c >= '0' && c <= '9')
                digit++;

        }

        System.out.println(upper);
        System.out.println(lower);
        System.out.println(digit);
    }
}
