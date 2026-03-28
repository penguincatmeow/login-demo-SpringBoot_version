package shape;


public class Rectangle implements Perarea {

    // 成员变量：长和宽
    private double length;
    private double width;


    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }


    @Override
    public double get_area() {
        return length * width;
    }


    @Override
    public double get_perimeter() {
        return 2 * (length + width);
    }
}
