package garen.java.demo.demo07.day13.demo4;

public class Outer {

    int num = 10;

    public class Inner {

        int num = 20;

        public void methodInner() {

            int num = 30;
            System.out.println(num);//局部变量，就近原则
            System.out.println(this.num);//本类-内部类成员变量访问
//        System.out.println(super.num);
            System.out.println(Outer.this.num);//外部类的同名变量访问

        }
    }
    public void methodOuter(){
        class Inner{ //局部内部类
            int num = 10;
            public void methodInner(){
                System.out.println("局部内部类的方法 number is " + num);
            }
        }
        Inner inner = new Inner();
        inner.methodInner(); //自己在方法中创建对象调用，只有自己能调用

    }
}
