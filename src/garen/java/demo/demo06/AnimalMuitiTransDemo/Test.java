package garen.java.demo.demo06.AnimalMuitiTransDemo;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();//多态，向上转型
        a.eat();
        //a.watchHome(); //使用Dog类特有的方法则需要向下转型
    /*为了使用狗类的lookHome方法，需要向下转型
      向下转型过程中，可能会发生类型转换的错误，即ClassCastException异常
      那么，在转之前需要做健壮性判断
    */
        if ( !(a instanceof Dog)) {
            System.out.println("Not matching type,cannot transit");
            return;
        }
        Dog d = (Dog) a;
        d.watchHome();
        Animal c = new Cat();
        c.eat();

        Cat moo = (Cat) c;
        moo.catchMouse();
    }
}
