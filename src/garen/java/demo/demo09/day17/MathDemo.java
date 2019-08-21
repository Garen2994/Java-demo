package garen.java.demo.demo09.day17;


public class MathDemo {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        function();

        long end = System.currentTimeMillis();
        System.out.println("用时： "+ (end-start));
//        function_1();


    }

    public static void function(){

        double a = Math.sqrt(2);
        System.out.println(a);

        double b = Math.floor(1.42465);
        System.out.println(b);

        double e = Math.ceil(1.42465);
        System.out.println(e);

        double f = Math.round(1.42465);
        System.out.println(f);


        double c = Math.pow(2,10);
        System.out.println(c);

        double d = Math.abs(-4.5);
        System.out.println(d);

        double g = Math.floor(Math.random()*10);
        System.out.println(g);


    }
}
