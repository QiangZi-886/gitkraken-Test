package src.threadDemo.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建一个只有一个线程的线程池，只能一个一个执行任务
 */
public class SingleThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        for (int i=0;i<20;i++){
            executorService.submit(new Task());
        }

        executorService.shutdown();
    }
}
