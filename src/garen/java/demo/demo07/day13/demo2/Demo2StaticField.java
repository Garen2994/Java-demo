package garen.java.demo.demo07.day13.demo2;

public class Demo2StaticField {
    public static void main(String[] args) {
        Student two = new Student("Garen02", 19);
        Student one = new Student("Garen01", 18);

        one.room = "J101";
        System.out.println("Name : " + two.getName() + "  ID: " + two.getId()
                + "  Age : " + two.getAge() + "  Room: " + Student.room);

        System.out.println("Name : " + one.getName() + "  ID: " + one.getId()
                + "  Age : " + one.getAge() + "  Room: " + Student.room);

    }
}
