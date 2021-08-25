package src.threadDemo.threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 可调度的线程池,延迟一秒执行，每三秒执行一次
 */
public class ScheduledThreadPoolDemo2 {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());
        //创建ScheduledExecutorService此类对象的方法和之前一样，在new新的线程池的时候，需要指定线程池中线程的个数
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);

        scheduledExecutorService.scheduleAtFixedRate(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟1秒执行...每三秒执行一次");
                System.out.println(System.currentTimeMillis());
            }
        },1,3,TimeUnit.SECONDS);
//        scheduledExecutorService.shutdownNow();

    }
}
