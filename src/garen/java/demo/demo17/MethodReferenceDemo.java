package garen.java.demo.demo17;

public class MethodReferenceDemo {
    public static void main(String[] args) {
//        method(-10, n -> Math.abs(n));
        method(-10,Math::abs);//Math是类名 abs是其静态方法
    }

    private static void method(int num, Calcable lambda) {
        System.out.println(lambda.calc(num));
    }
}
