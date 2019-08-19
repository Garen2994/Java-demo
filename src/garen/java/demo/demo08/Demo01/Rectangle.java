package garen.java.demo.demo08.Demo01;

//长方形类
public class Rectangle extends Tangle{
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //求周长方法
    public double calCircum() {
        return (length + width) * 2;
    }

    //求面积方法
    public double calArea() {
        return length * width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
