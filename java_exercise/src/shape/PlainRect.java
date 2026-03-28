package shape;

/**
 * 具有确定位置的矩形类（子类）
 * 继承 Rect，并增加左上角坐标属性
 */
public class PlainRect extends Rect {

    // 新增成员变量：左上角坐标
    private double startX;
    private double startY;

    /**
     * 无参构造方法
     * 初始化为左上角坐标(0,0)，宽和高都为0
     */
    public PlainRect() {
        super(0, 0);  // 调用父类的构造方法，设置宽和高为0
        this.startX = 0;
        this.startY = 0;
    }

    /**
     * 带4个参数的构造方法
     * @param startX 左上角X坐标
     * @param startY 左上角Y坐标
     * @param width 宽
     * @param height 高
     */
    public PlainRect(double startX, double startY, double width, double height) {
        super(width, height);  // 调用父类的构造方法，设置宽和高
        this.startX = startX;
        this.startY = startY;
    }


    public boolean isInside(double x, double y) {

        return (x >= startX && x <= startX + width) &&
                (y >= startY && y <= startY + height);
    }

    public double getStartX() {
        return startX;
    }


    public double getStartY() {
        return startY;
    }
}