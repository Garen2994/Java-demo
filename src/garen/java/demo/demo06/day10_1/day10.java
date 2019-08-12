package garen.java.demo.demo06.day10_1;


/*
    继承、重写、
 */
public class day10 {
    public static void main(String[] args) {
        Developer d = new Developer();
        d.work(); //子类中没有show方法，但是可以找到父类方法去执行
        d.show();//Developer子类show() 子类有直接使用子类的

    }

}
