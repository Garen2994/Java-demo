package garen.java.demo.demo12;

public class ThrowsDemo {
    public static void main(String[]args) throws Exception{
        int x = 2;
        show(x);
    }
    public static void show(int x) throws Exception{

        if (x>0){
            throw new Exception("Exception!!");
        }else {
            System.out.println("show() is running");
        }
    }
}
