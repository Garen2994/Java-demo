package garen.java.demo.demo14.day27.SaleTicketPractice;


public class SaleTicketDemo {
    public static void main(String[] args) {
        SaleTicket sale = new SaleTicket();
        Thread T1 = new Thread(sale,"Windows No.1");
        Thread T2 = new Thread(sale,"Windows No.2");
        Thread T3 = new Thread(sale,"Windows No.3");
        Thread T4 = new Thread(sale,"Windows No.4");
        T1.start();
        T2.start();
        T3.start();
        T4.start();

    }
}
