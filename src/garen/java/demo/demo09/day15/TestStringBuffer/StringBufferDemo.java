package garen.java.demo.demo09.day15.TestStringBuffer;

public class StringBufferDemo {
    public static void main(String[] args) {

        function();
        function_1();
        function_2();
        function_3();
        function_4();
        function_5();

    }
    /*
     * StringBuffer类的方法
     * String toString() 继承Object,重写toString()
     * 将缓冲区中的所有字符,变成字符串
     */
    public static void function(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("java");
        buffer.append(4536251);

        String s = buffer.toString();
        System.out.println(s);

    }
    /*
     *  StringBuffer类的方法
     *    reverse() 将缓冲区中的字符反转
     */
    public static void function_1(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("is the best");
        buffer.reverse();
        System.out.println(buffer);

    }
    /*
     *  StringBuffer类方法
     *    replace(int start,int end, String str)
     *    将指定的索引范围内的所有字符,替换成新的字符串
     */
    public static void function_2(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("computer language");
        buffer.replace(0,7," ");
        System.out.println(buffer);
    }
    /*
     *  StringBuffer类方法 insert
     *    insert(int index, 任意类型)
     *  将任意类型数据,插入到缓冲区的指定索引上
     */
    public static void function_3(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("I hate");
        buffer.insert(3,"LOL");
        System.out.println(buffer);

    }
    /*
     * StringBuffer类方法
     *   delete(int start,int end) 删除缓冲区中字符
     *   开始索引包含,结尾索引不包含
     */
    public static void function_4(){
        StringBuffer buffer = new StringBuffer();
        buffer.append("apple juice");
        buffer.delete(3,5);
        System.out.println(buffer);
    }
    /*
     *  StringBuffer类方法
     *   StringBuffer append, 将任意类型的数据,添加缓冲区
     *   append 返回值,写return this
     *   调用者是谁,返回值就是谁
     */
    public static void function_5(){
        StringBuffer buffer = new StringBuffer();
        //调用StringBuffer方法append向缓冲区追加内容
        buffer.append(6).append(false).append('a').append(1.5);
        System.out.println(buffer);
    }

}
