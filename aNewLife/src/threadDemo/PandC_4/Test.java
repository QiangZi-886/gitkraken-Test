package src.threadDemo.PandC_4;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Test {
    public static void main(String[] args) {
        //ArrayBlockingQueue需要提供一个capacity容量，作为队列容量
        BlockingQueue blockingQueue = new ArrayBlockingQueue(5);
        ProducerQueue producerQueue = new ProducerQueue(blockingQueue);
        ConsumerQueue consumerQueue = new ConsumerQueue(blockingQueue);

        Thread t1 = new Thread(producerQueue);
        Thread t2 = new Thread(consumerQueue);

        t1.start();
        t2.start();
    }
}
