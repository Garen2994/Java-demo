package garen.java.demo.demo06.DogDemo;

class AntiDragDog extends Dog implements AntiDrag{

    public void antiDrag() {
        System.out.println("Start Anti-Draging...");
    }

    public void eat() {
        System.out.println("yum yum yum ...");
    }

    public void bark() {
        System.out.println("汪 汪 汪...");
    }
}
