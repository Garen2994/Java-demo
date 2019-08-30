package garen.java.demo.demo14.day27.SaleTicketPractice;


public class SaleTicket implements Runnable {
    private int ticket = 10000;
    Object lock = new Object();

    @Override
    public void run() {
        //模拟售票任务
        while (true) {
            synchronized(lock) { //同步代码块加锁

                if (ticket > 0) {
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException ie) {
                        ie.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + " is selling ticket --- " + "spare tickets " +
                            ": " + (ticket--));
                }
            }
        }
    }
}

