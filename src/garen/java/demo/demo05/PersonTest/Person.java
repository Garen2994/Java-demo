package garen.java.demo.demo05.PersonTest;

public class Person {
    private int age;
    private String name;

    // 对外提供访问成员变量的方法
    public int getAge() {
        return age;
    }

    // 对外提供设置成员变量的方法
    public void setAge(int age) {
        //this为本类的对象引用
        if (age < 0 || age > 130) {
            System.out.println(age + "不符合年龄的数据范围");
            return;
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void speak() {

        System.out.println("name=" + this.name + ",age=" + this.age);//this就是p
    }
    public boolean equalsAge(Person p) {
        // 使用当前调用该equalsAge方法对象的age和传递进来p的age进行比较
        // 由于无法确定具体是哪一个对象调用equalsAge方法，这里就可以使用this来代替
        /*
         * if(this.age == p.age) { return true; } return false;
         */
        return this.age == p.age;
    }
}
