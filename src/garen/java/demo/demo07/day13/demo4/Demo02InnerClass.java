package garen.java.demo.demo07.day13.demo4;

public class Demo02InnerClass {
    public static void main(String[] args) {
        Outer.Inner oi = new Outer().new Inner();
        oi.methodInner();

        Outer obj = new Outer();
        obj.methodOuter();
    }
}
