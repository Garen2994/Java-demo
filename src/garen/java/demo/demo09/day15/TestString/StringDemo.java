package garen.java.demo.demo09.day15.TestString;

public class StringDemo {
    public static void main(String[] args) {

        //引用变量str执行内存变化
        //定义好的字符串对象,不变

        String str1 = "akaGaren";
        System.out.println(str1);
        String str2 = new String("akaGaren");
        System.out.println(str2);

        System.out.println(str1==(str2));//比较内存地址
        System.out.println(str1.equals(str2));//String类继承Object,重写了equals方法用来比较字符串每个字符是否一样

        function_1();
    }
    public static void function_1(){
        char[] ch = {'a','b','c','d','e','f'};
        //调用String构造方法,传递字符数组
        String s = new String(ch);
        System.out.println(s);
        String s1 = new String(ch,1,4);
        System.out.println(s1);
    }

}

