package triangle;

public class Triangle {
    private double sideA;
    private double sideB;
    private double sideC;
    public Triangle(double sideA,double sideB,double sideC){
        this.sideA=sideA;
        this.sideB=sideB;
        this.sideC=sideC;
    }
    private boolean isValidTriangle(){
        if (sideA<=0||sideB<=0||sideC<=0) {
            return false;
        }
        if (sideA + sideB <= sideC ||
                sideA + sideC <= sideB ||
                sideB + sideC <= sideA) {
            return false;
        }
        else
            return true;
    }
    public double area()throws NotTriangle{
        if (!isValidTriangle()) {
            throw new NotTriangle("三角形不成立！边长分别为：" + sideA + ", " + sideB + ", " + sideC);
        }
        double s = (sideA + sideB + sideC) / 2;  // 半周长
        double area = Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));

        return area;

    }




}