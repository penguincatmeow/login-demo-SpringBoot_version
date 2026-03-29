package bank;


public class BankAccount {
    private String accountNumber;  // 账户号码
    private double balance;        // 账户余额

    /**
     * 构造方法
     * @param accountNumber 账户号码
     * @param initialBalance 初始余额
     */
    public BankAccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    /**
     * 存款
     * @param amount 存款金额
     */
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存款成功！存入 " + amount + " 元");
        } else {
            System.out.println("存款金额必须大于0！");
        }
    }

    /**
     * 取款
     * @param amount 取款金额
     * @throws InsufficientBalanceException 如果余额不足则抛出异常
     */
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount <= 0) {
            System.out.println("取款金额必须大于0！");
            return;
        }

        if (amount > balance) {
            throw new InsufficientBalanceException(accountNumber, amount);
        }

        balance -= amount;
        System.out.println("取款成功！取出 " + amount + " 元，剩余余额: " + balance + " 元");
    }

    public double getBalance() {
        return balance;
    }


    public String getAccountInfo() {
        return "账户: " + accountNumber + ", 余额: " + balance + " 元";
    }
}