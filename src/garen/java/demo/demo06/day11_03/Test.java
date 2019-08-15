package garen.java.demo.demo06.day11_03;
/*
多态体现为父类引用变量可以指向子类对象。
 */
class Test {

    public static void main(String[] args) {
        Fu f  = new Fu();
        System.out.println(f.num);
        f.show();
        Zi z =  new Zi();
        System.out.println(z.num);
        z.show();
        Fu f1 = new Zi();//类的多态使用
        System.out.println(f1.num);//调用引用型变量所属的类中的成员变量 //编译运行看左边
        f1.show();//编译看左边，运行看右边。
        boolean b = z instanceof Fu;
        System.out.println(b);
    }

}
