package garen.java.demo.demo08.Demo01;

public class DemoMain {
    public static void main(String[] args) {
        Tangle rt = new Rectangle(3.0, 4.0);
//        Rectangle rt1 = new Rectangle(5.0, 10.0);

//        System.out.println("The circumference of rectangle is: " + rt.calCircum());
//        System.out.println("The area of rectangle is: " + rt.calArea());

        //调用以类作为参数的方法
        method(rt);
//        method(rt1);
        Tangle rt2 = method1();
        System.out.println(rt2.calCircum());
        System.out.println(rt2.calArea());
    }
    //类作为方法参数
        public static void method(Tangle obj){

            obj.calArea();
            System.out.println("The circumference of rectangle is: " + obj.calCircum());
            obj.calCircum();
            System.out.println("The area of rectangle is: " + obj.calArea());
        }

        //类作为方法返回值
        public static Tangle method1(){
            Tangle obj = new Rectangle(3.8,4.0);
            return obj;

        }
    }

