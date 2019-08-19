package garen.java.demo.demo08.HotelDemo;

public class Cook extends Employee implements VIPService{

    public Cook() {
    }

    public Cook(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("Cook " + this.getName() + "(ID is " + this.getId() +") is cooking ");
    }

    @Override
    public void serve() {
        System.out.println("Cooks provide the VIP service");
    }
}
