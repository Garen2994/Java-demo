package garen.java.demo.demo06.day10_1;


class Developer extends Employee {
    //子类中成员变量
    String name = "Garen";

    public void work() {  //此处work方法权限public > 默认，所以可以编译运行，否则编译不通过
        System.out.println("子类Developer中的work方法执行ing...");
    }

    //子类复写了父类的show方法
    public void show() {

        System.out.println("子类show()执行ing...");
    }

}
