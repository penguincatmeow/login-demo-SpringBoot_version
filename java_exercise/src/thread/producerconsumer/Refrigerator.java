package thread.producerconsumer;

import java.util.LinkedList;
import java.util.Queue;

public class Refrigerator {
    private Queue<IceCream> iceCreams = new LinkedList<>();
    private int maxCapacity;
    private int iceCreamId = 0;

    public Refrigerator(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public synchronized void produceIceCream(String producerName) throws InterruptedException {
        while (iceCreams.size() >= maxCapacity) {
            System.out.println("❄️ " + producerName + ": 冰箱满了！");
            wait();
        }

        String[] flavors = {"巧克力", "草莓", "香草", "抹茶", "芒果"};
        String flavor = flavors[(int)(Math.random() * flavors.length)];
        IceCream iceCream = new IceCream(++iceCreamId, flavor);
        iceCreams.offer(iceCream);
        System.out.println("🍨 " + producerName + " 生产了: " + iceCream);
        notifyAll();
    }

    public synchronized IceCream consumeIceCream(String consumerName) throws InterruptedException {
        while (iceCreams.isEmpty()) {
            System.out.println("🐱 " + consumerName + ": 没有冰淇淋了！");
            wait();
        }

        IceCream iceCream = iceCreams.poll();
        System.out.println("🐱 " + consumerName + " 吃掉了: " + iceCream);
        notifyAll();
        return iceCream;
    }
}