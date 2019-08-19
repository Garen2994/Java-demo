package garen.java.demo.demo09.day15.TestToString;

public class Person extends Object {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    /*
     * 重写父类的方法toString()
     * 没有必要让调用者看到内存地址
     * 要求: 方法中,返回类中所有成员变量的值
     */

    /*

    public String toString(){
        return name + age;

    }*/
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
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
}
