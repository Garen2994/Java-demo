package garen.java.demo.demo09.day15.TestEquals;

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
     * 将父类的equals方法写过来,重写父类的方法
     * 但是,不改变父类方法的源代码, 方法equals 比较两个对象的内存地址
     *
     */
    public boolean equals(Object obj){

        return this == obj;
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
