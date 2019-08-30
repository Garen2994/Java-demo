package garen.java.demo.demo14.day27.WaitNotifyDemo;

public class Resource {
    private String name;
    private String sex;
    private boolean flag = false; //Resource中没有值时，设置为false

    public synchronized void set(String name, String sex) {  //第一个同步锁
        if (flag) {

            try {
                wait(); //wait()方法必须放在同步之中才有效
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

            this.name = name;
            this.sex = sex;

            //输入之后设置为非空 true
            flag = true;
            //唤醒Output来输出
            this.notify();  //被同步方法中的类调用


    }

    public synchronized void out(){  //第二个同步锁
        if(!flag) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

            System.out.println("Name : "+name + "   Gender : " + sex);
            //输出之后设置为空
            flag = false;

            //唤醒在wait() 的Input线程来输入
            this.notify();


    }
}
