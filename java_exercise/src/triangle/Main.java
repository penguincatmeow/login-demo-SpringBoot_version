package triangle;

import bank.BankAccount;
import bank.InsufficientBalanceException;


public class Main {

    public static void main(String[] args) {
        System.out.println("========== 三角形测试 ==========");
        testTriangle();

        System.out.println("\n========== 银行账户测试 ==========");
        testBankAccount();
    }

    /**
     * 测试三角形面积计算
     */
    private static void testTriangle() {
        // 测试数据1：3.0, 4.0, 5.0（直角三角形，成立）
        Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
        try {
            double area1 = triangle1.area();
            System.out.println("三角形1 (3.0, 4.0, 5.0) 的面积是: " + area1);
        } catch (NotTriangle e) {
            System.out.println("错误：" + e.getMessage());
        }

        // 测试数据2：1.0, 1.0, 2.0（不成立，因为1+1=2）
        Triangle triangle2 = new Triangle(1.0, 1.0, 2.0);
        try {
            double area2 = triangle2.area();
            System.out.println("三角形2 (1.0, 1.0, 2.0) 的面积是: " + area2);
        } catch (NotTriangle e) {
            System.out.println("错误：" + e.getMessage());
        }

        // 额外测试：负数边长（不成立）
        Triangle triangle3 = new Triangle(-1.0, 2.0, 3.0);
        try {
            double area3 = triangle3.area();
            System.out.println("三角形3 (-1.0, 2.0, 3.0) 的面积是: " + area3);
        } catch (NotTriangle e) {
            System.out.println("错误：" + e.getMessage());
        }
    }

    /**
     * 测试银行账户提款功能
     */
    private static void testBankAccount() {
        // 创建账户，初始余额1000元
        BankAccount account = new BankAccount("12345678", 1000.0);
        System.out.println("账户号码：12345678，初始余额：1000.0");

        try {
            // 正常提款500元
            System.out.println("\n尝试提取 500.0 元...");
            account.withdraw(500.0);

            // 尝试提款800元（余额不足，会抛出异常）
            System.out.println("\n尝试提取 800.0 元...");
            account.withdraw(800.0);

        } catch (InsufficientBalanceException e) {
            System.out.println("异常：" + e.getMessage());
        }

        System.out.println("\n当前余额：" + account.getBalance());
    }
}