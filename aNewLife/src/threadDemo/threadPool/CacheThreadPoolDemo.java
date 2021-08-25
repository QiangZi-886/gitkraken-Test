package src.threadDemo.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * cache 缓存 缓存线程池，使用的Executors.newCachedThreadPool()方法中不需要指定生成的线程数量，它会根据需要自动创建线程数量，最大值为Max Integer(21亿多)
 * 不指定Task线程休眠时间的话，线程可复用。
 */
public class CacheThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i=0;i<20;i++){
            executorService.submit(new Task());
        }

        //资源使用完毕之后归还回线程池
        executorService.shutdown();
    }
}
