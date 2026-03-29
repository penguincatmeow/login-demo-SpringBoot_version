package thread.producerconsumer;

public interface IceCreamProducer {
    void produce();              // 生产一个冰淇淋
    void stop();                 // 停止生产
    int getProducedCount();      // 获取已生产的数量
    String getProducerName();    // 获取生产者名称
}