package thread.producerconsumer;

// 需要同时实现 IceCreamProducer 接口和 Runnable 接口
public class IceCreamMachine implements IceCreamProducer, Runnable {

    // ========== 属性声明 ==========
    private String name;              // 机器名称
    private Refrigerator refrigerator; // 冰箱（仓库）
    private volatile boolean running;  // 运行状态
    private int producedCount;         // 生产数量
    private int speed;                 // 生产速度（毫秒）

    // ========== 构造方法 ==========
    public IceCreamMachine(String name, Refrigerator refrigerator, int speed) {
        this.name = name;
        this.refrigerator = refrigerator;
        this.speed = speed;
        this.running = true;
        this.producedCount = 0;
    }

    @Override
    public void produce() {
        try {
            // 调用冰箱的生产方法
            refrigerator.produceIceCream(name);
            producedCount++;
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    @Override
    public void stop() {
        this.running = false;
    }

    @Override
    public int getProducedCount() {
        return producedCount;
    }

    @Override
    public String getProducerName() {
        return name;
    }

    @Override
    public void run() {
        while (running) {
            produce();  // 生产冰淇淋

            try {
                Thread.sleep(speed);  // 等待一段时间再生产下一个
            } catch (InterruptedException e) {
                break;
            }
        }

        System.out.println("🏭 " + name + " 停止生产，共生产了 " + producedCount + " 个冰淇淋");
    }
}