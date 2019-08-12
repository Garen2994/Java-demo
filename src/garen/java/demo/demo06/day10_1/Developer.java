package garen.java.demo.demo06.day10_1;


class Developer extends Employee {
    //子类中成员变量
    String name = "Garen";

    public void work() {  //此处work方法权限public > 默认，所以可以编译运行，否则编译不通过
        System.out.println("子类Developer中的work方法执行ing...");
    }

    @Override
    //子类复写了父类的show方法
    public void show() {   //返回值为基本类型的重写

        System.out.println("子类show()执行ing...");

    }

    /*@Override
    public Employee method() {
        return super.method(); //子类的方法和重写的父类的方法返回值类型可以相同
    }

    @Override
    public Developer method1() {//子类方法的返回值类型是父类方法返回值类型的子类

    }*/
}
