package garen.java.demo.demo08.HotelDemo;

public class Manager extends Employee {
    private double award;

    public Manager() {
    }

    public Manager(String name, String id, double award) {
        super(name, id);
        this.award = award;
    }

    @Override
    public void work() {
        System.out.println("Manager " + this.getName() + "(ID is " + this.getId() +") is managing ");

    }

    public double getAward() {
        return award;
    }

    public void setAward(double award) {
        this.award = award;
    }
}
