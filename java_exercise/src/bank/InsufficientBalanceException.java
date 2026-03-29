package bank;
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String accountNumber, double amount) {
        super("账户 [" + accountNumber + "] 余额不足！尝试提取金额: " + amount + " 元");
    }
    public InsufficientBalanceException(String message) {
        super(message);
    }
}