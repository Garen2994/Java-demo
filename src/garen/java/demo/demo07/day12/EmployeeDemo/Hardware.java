package garen.java.demo.demo07.day12.EmployeeDemo;

public class Hardware extends Maintainer{
    public Hardware() {
    }

    public Hardware(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("员工号为" + this.getId() +" 的" +this.getName() + "员工，正在维修打印机");

    }
}
