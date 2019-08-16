package garen.java.demo.demo07.day12.EmployeeDemo;

public class JavaEE extends Developer {
    public JavaEE() {
    }

    public JavaEE(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("员工号为" + this.getId() +" 的" +this.getName() + "员工，正在研发淘宝网站");
    }
}
