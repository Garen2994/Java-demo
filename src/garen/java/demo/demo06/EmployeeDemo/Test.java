package garen.java.demo.demo06.EmployeeDemo;

public class Test {

    public static void main(String[] args) {

        JavaEE ee = new JavaEE();
        ee.setId("je89757");
        ee.setName("Eason");
        ee.work();

        Android andr = new Android();
        andr.setId("an89757");
        andr.setName("Andrew");
        andr.work();

        Network nw = new Network();
        nw.setId("nw89757");
        nw.setName("Noah");
        nw.work();

        Hardware hw = new Hardware();
        hw.setId("hw89757");
        hw.setName("Halen");
        hw.work();

    }

}
