package thread.producerconsumer;

public class IceCreamShop {
    public static void main(String[] args) {
        System.out.println("=== 🍦 罗小黑冰淇淋店开张啦！🍦 ===\n");

        // 冰箱容量8个冰淇淋
        Refrigerator refrigerator = new Refrigerator(8);

        // 两台冰淇淋机器
        IceCreamMachine machineA = new IceCreamMachine("冰淇淋机器-A", refrigerator, 800);
        IceCreamMachine machineB = new IceCreamMachine("冰淇淋机器-B", refrigerator, 1000);

        // 两个罗小黑
        LuoXiaoHei xiaoHei1 = new LuoXiaoHei("小黑", refrigerator, 1200);
        LuoXiaoHei xiaoHei2 = new LuoXiaoHei("嘿咻", refrigerator, 1400);

        // 启动所有线程
        Thread m1 = new Thread(machineA);
        Thread m2 = new Thread(machineB);
        Thread h1 = new Thread(xiaoHei1);
        Thread h2 = new Thread(xiaoHei2);

        m1.start();
        m2.start();
        h1.start();
        h2.start();

        // 运行15秒
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 停止所有
        System.out.println("\n=== 🏪 冰淇淋店打烊啦！🏪 ===\n");
        machineA.stop();
        machineB.stop();
        xiaoHei1.stop();
        xiaoHei2.stop();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 统计
        System.out.println("\n=== 📊 营业统计 📊 ===");
        System.out.println("冰淇淋机器-A 生产: " + machineA.getProducedCount() + " 个");
        System.out.println("冰淇淋机器-B 生产: " + machineB.getProducedCount() + " 个");
        System.out.println("总生产: " + (machineA.getProducedCount() + machineB.getProducedCount()) + " 个");
        System.out.println("小黑 吃了: " + xiaoHei1.getConsumedCount() + " 个");
        System.out.println("嘿咻 吃了: " + xiaoHei2.getConsumedCount() + " 个");
        System.out.println("总消费: " + (xiaoHei1.getConsumedCount() + xiaoHei2.getConsumedCount()) + " 个");
    }
}