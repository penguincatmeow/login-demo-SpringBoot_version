package thread.producerconsumer;

public class LuoXiaoHei implements IceCreamConsumer, Runnable {

    // ========== 属性声明 ==========
    private String name;
    private Refrigerator refrigerator;
    private volatile boolean running;
    private int consumedCount;
    private int speed;

    // ========== 构造方法 ==========
    public LuoXiaoHei(String name, Refrigerator refrigerator, int speed) {
        this.name = name;
        this.refrigerator = refrigerator;
        this.speed = speed;
        this.running = true;
        this.consumedCount = 0;
    }

    // ========== 实现 IceCreamConsumer 接口的方法 ==========

    @Override
    public void consume() {
        try {
            refrigerator.consumeIceCream(name);
            consumedCount++;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void stop() {
        this.running = false;
    }

    @Override
    public int getConsumedCount() {
        return consumedCount;
    }

    @Override
    public String getConsumerName() {
        return name;
    }

    @Override
    public void run() {
        while (running) {
            consume();

            try {
                Thread.sleep(speed);  // 咪吃完一个休息一下再吃下一个
            } catch (InterruptedException e) {
                break;
            }
        }

        System.out.println("🐱 " + name + " 不吃了，共吃了 " + consumedCount + " 个");
        if (consumedCount > 0) {
            System.out.println("🐱 " + name + ": 嗝~ 吃饱啦！");
        }
    }
}