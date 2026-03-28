package shape;

/**
 * 测试类
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("========== 第一部分：接口测试 ==========");
        testInterface();

        System.out.println("\n========== 第二部分：继承测试 ==========");
        testInheritance();
    }
    private static void testInterface() {
        // 1. 创建长方形对象：长10，宽5
        System.out.println("创建长方形：长10，宽5");
        Rectangle rectangle = new Rectangle(10, 5);
        System.out.println("长方形面积：" + rectangle.get_area());
        System.out.println("长方形周长：" + rectangle.get_perimeter());

        // 2. 创建圆形对象：半径5
        System.out.println("\n创建圆形：半径5");
        Circle circle = new Circle(5);
        System.out.println("圆形面积：" + circle.get_area());
        System.out.println("圆形周长：" + circle.get_perimeter());

        // 3. 多态演示
        System.out.println("\n多态演示：使用接口引用");
        Perarea shape1 = new Rectangle(10, 5);
        Perarea shape2 = new Circle(5);
        System.out.println("长方形面积（接口引用）：" + shape1.get_area());
        System.out.println("圆形面积（接口引用）：" + shape2.get_area());
    }

    private static void testInheritance() {

        System.out.println("创建矩形：左上角(10,10)，宽20，高10");
        PlainRect plainRect = new PlainRect(10, 10, 20, 10);

        System.out.println("矩形左上角坐标：(" + plainRect.getStartX() + ", " + plainRect.getStartY() + ")");
        System.out.println("矩形宽度：" + plainRect.width);
        System.out.println("矩形高度：" + plainRect.height);
        System.out.println("矩形面积：" + plainRect.area());
        System.out.println("矩形周长：" + plainRect.perimeter());


        double testX = 25.5;
        double testY = 13;
        boolean inside = plainRect.isInside(testX, testY);
        System.out.println("\n点(" + testX + ", " + testY + ")是否在矩形内：" + inside);

        // 额外测试点
        System.out.println("\n额外测试点：");
        System.out.println("点(15, 15)是否在矩形内：" + plainRect.isInside(15, 15));
        System.out.println("点(30, 15)是否在矩形内：" + plainRect.isInside(30, 15));
        System.out.println("点(5, 5)是否在矩形内：" + plainRect.isInside(5, 5));
    }
}