package garen.java.demo.demo04.ClassTest;


public class ClassDemo {
    public static void main(String[] args) {
        //创建电饭锅引用类型
        DianFanGuo dfg = new DianFanGuo();

        dfg.brand = "苏泊尔";
        dfg.color = "红色";
        dfg.size = 30;

        System.out.println(dfg.brand + "  " + dfg.color + "  " + dfg.size);

        //创建汽车引用类型
        Car c = new Car();
        c.brand = "巨力";
        c.type = "拖拉机";
        c.paiLiang = 0.5;

        System.out.println(c.brand + "  " + c.type + "  " + c.paiLiang);

        //创建学生引用类型
        StudentClass stu = new StudentClass();
        stu.name = "张三";
        stu.age = 20;
        stu.sex = '男';
        System.out.println(stu.name + "  " + stu.age + "  " + stu.sex);

    }

}
