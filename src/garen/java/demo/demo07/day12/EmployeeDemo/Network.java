package garen.java.demo.demo07.day12.EmployeeDemo;

public class Network extends Maintainer{
    public Network() {
    }

    public Network(String id, String name) {
        super(id, name);
    }

    @Override
    public void work() {
        System.out.println("员工号为" + this.getId() +" 的" +this.getName() + "员工，正在检查网络是否畅通");

    }
}
