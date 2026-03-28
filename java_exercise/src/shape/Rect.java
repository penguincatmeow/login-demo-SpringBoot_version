package shape;

public class Rect {

    // 成员变量（用 protected 修饰，让子类可以访问）
    protected double width;   // 宽
    protected double height;  // 高


    public Rect() {
        this.width = 10;
        this.height = 10;
    }


    public Rect(double width, double height) {
        this.width = width;
        this.height = height;
    }


    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }
}