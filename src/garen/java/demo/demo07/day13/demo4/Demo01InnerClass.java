package garen.java.demo.demo07.day13.demo4;


public class Demo01InnerClass {
    public static void main(String[] args) {
        Body body = new Body();
        body.setLife(true);
        body.methodBody();

        Body.Heart bh = new Body().new Heart();//不借助外部类方法
        bh.beat();
    }


}
