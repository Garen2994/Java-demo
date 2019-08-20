package garen.java.demo.demo09.day15.TestString;

/*
 *  获取一个字符串中,另一个字符串出现的次数
 *  思想:
 *    1. indexOf到字符串中到第一次出现的索引
 *    2. 找到的索引+被找字符串长度,截取字符串
 *    3. 计数器++
 */
public class StringPractice02 {
    public static void main(String[] args) {
        String str = "hellojava,nihaojava,ciaojava,javaisbest";
        String substr = "java";
        int count = getStringCount(str,substr);
        System.out.println(substr + " 出现的次数为 " + count);
    }

    public static int getStringCount(String str, String key) {

        int count = 0;
        int index = 0;
        while ((index = str.indexOf(key)) != -1) {//indexOf()如果找不到指定字符串返回 -1
            count++;
            str = str.substring(index + key.length());

        }
        return count;
    }
}
