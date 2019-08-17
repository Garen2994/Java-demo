package garen.java.demo.demo07.day13.demo4;

public class Body {//外部类

    private boolean life = true;

    public class Heart { //成员内部类
        public void beat() {
            System.out.println("内部类的方法");
            System.out.println("The heart is beating" + "Life Status is " + life);
        }
    }


    public void methodBody() {
        System.out.println("外部类的方法");
        new Heart().beat();

    }

    public boolean isLife() {
        return life;
    }

    public void setLife(boolean life) {
        this.life = life;
    }
}
