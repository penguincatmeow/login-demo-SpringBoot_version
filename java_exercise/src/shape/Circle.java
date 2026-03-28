package shape;
public class Circle implements Perarea {

    // 成员变量：半径
    private double radius;


    public Circle(double radius) {
        this.radius = radius;
    }


    @Override
    public double get_area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double get_perimeter() {
        return 2 * Math.PI * radius;
    }
}