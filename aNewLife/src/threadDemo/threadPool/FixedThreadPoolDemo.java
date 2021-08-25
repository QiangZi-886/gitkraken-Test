package src.threadDemo.threadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 创建指定线程数量（容积）的线程池，如果在Task线程测试类中没有给定线程休眠时间。那么在线程池中已创建的线程在完成任务之后会复用
 */
public class FixedThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i=0;i<=20;i++){
            executorService.submit(new Task());
        }

        executorService.shutdown();
    }
}
