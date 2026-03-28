package thread.producerconsumer;

public interface IceCreamConsumer {
    void consume();              // 消费冰淇淋
    void stop();                 // 停止消费
    int getConsumedCount();      // 获取消费数量
    String getConsumerName();    // 获取消费者名称
}