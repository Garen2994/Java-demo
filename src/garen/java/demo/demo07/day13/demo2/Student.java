package garen.java.demo.demo07.day13.demo2;

public class Student {
    private int id;
    private String name;
    private int age;
    static String room;
    static int idcounter = 14;

    public Student() {
        idcounter++;

    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = idcounter++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
