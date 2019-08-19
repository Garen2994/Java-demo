package garen.java.demo.demo07.day13.demo6;

public class DemoBlock {
    public static void main(String[] args) {
        {
            int x = 1;
            System.out.println("normal code block1 " + x);
        }
        {
            int x = 3;
            System.out.println("normal code block2 " + x);
        }

        int x = 99;
        System.out.println("outside code block " + x);
    }

}
