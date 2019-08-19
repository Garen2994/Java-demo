package garen.java.demo.demo08.HotelDemo;

public class Waiter extends Employee implements VIPService {
    public Waiter() {
    }

    public Waiter(String name, String id) {
        super(name, id);
    }

    @Override
    public void work() {
        System.out.println("Waiter " + this.getName() + "(ID is " + this.getId() +") is serving ");

    }

    @Override
    public void serve() {
        System.out.println("Waiters provide the VIP service");
    }
}
