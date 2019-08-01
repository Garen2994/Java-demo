package garen.java.demo.demo01;

import java.util.Random;

/*随机点名器案例分析
        * A 随机点名器案例分析
         1. 存储姓名
		 2. 预览所有人的姓名
		 3. 随机出一个人的姓名
        * B: 需求
        * 随机点名器，即在全班同学中随机的打印出一名同学名字。

        * C:分析:
        * 1)定义数组存数全班同学
        * 2)生成随机数范围0 到 数组长度-1
        * 3)根据这个索引找到数组中的同学名称
*/
public class CallName {
    public static void main(String[] args) {
        //存储姓名,姓名存储到数组中
        //数组存储姓名,姓名的数据类型,String
        String[] names = {"张三", "李四", "王五", "李蕾", "韩梅梅", "小明", "老王", "小华", "约翰逊", "爱丽丝"};
        //预览所有人的姓名
        for (String str : names)
            System.out.println(str);
        System.out.println("============");

        //随机出一个人的姓名
        Random ran = new Random();
        int index = ran.nextInt(names.length);
        System.out.println("随机点的名字为：" + names[index]);
//        System.out.println(names[new Random().nextInt(names.length)]);
    }
}
