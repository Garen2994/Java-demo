package garen.java.demo.demo07.day12.EmployeeDemo;

public class Test {
    public static void main(String[] args) {
        JavaEE je = new JavaEE("je89757","Garen01");
        je.work();

        Network nw = new Network("nw89757","Garen03");
        nw.work();

        Maintainer mt = new Hardware("hw89757","Garen04");
        mt.work();

        Employee ee = new Android("ad89757","Garen02");
        ee.work();

        boolean a = ee instanceof Employee;
        System.out.println(a);
        boolean b = ee instanceof Developer;
        System.out.println(b);
        boolean c = ee instanceof Android;
        System.out.println(c);

    }
}
