package src.threadDemo.PandC_4;

import java.util.concurrent.BlockingQueue;

public class ProducerQueue implements Runnable{

    private BlockingQueue blockingQueue;

    public ProducerQueue(BlockingQueue blockingQueue) {
        this.blockingQueue = blockingQueue;
    }

    @Override
    public void run() {
        for (int i = 0;i<10;i++){
            System.out.println("生产者生产的商品是："+i);
            try {
                blockingQueue.put(i);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
