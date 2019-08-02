package garen.java.demo.demo04;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDemo {
    public static void main(String[] args) {
        //创建集合容器,指定存储的数据类型
        //存储字符串
        ArrayList<String> array = new ArrayList<String>();
        array.add("garen");
        array.add("keeps");
        array.add("running");
        array.add("and coding");
        //输出集合的长度,调用集合方法size, size方法的返回值类型 int
        int size = array.size();
        System.out.println(size);

        //获取出集合中的一个元素,获取1索引的元素
        //集合的方法get, 获取元素后结果数据类型
        String s = array.get(1);
        System.out.println(s);

        //遍历ArrayList集合
        for (String str : array)
            System.out.println(str);

        //创建集合容器,存储整数
        ArrayList<Integer> array2 = new ArrayList<Integer>();
        array2.add(121);
        array2.add(125);
        array2.add(123);
        array2.add(120);
        array2.add(128);
        //对集合进行遍历
        //使用方法 size+get组合进行遍历
        for(int i = 0 ; i < array2.size(); i++){
            System.out.println( array2.get(i) );
        }
        //在索引2上,添加元素7
        array2.add(2,7);

        //将0索引上的元素,修改成10
        array2.set(0,10);

        //将4索引上的元素,删除
        array2.remove(4);
        for(int i = 0 ; i < array2.size(); i++){
            System.out.println( array2.get(i) );
        }
        //存储手机类型
        ArrayList<Phone> array3 = new ArrayList<Phone>();

    }

}
