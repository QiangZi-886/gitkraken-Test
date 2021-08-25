package src.threadDemo.threadPool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 可调度的线程池
 */
public class ScheduledThreadPoolDemo {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());

        //创建ScheduledExecutorService此类对象的方法和之前一样，在new新的线程池的时候，需要指定线程池中线程的个数
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(3);
        //schedule方法可以传入三个参数，分别是(Runnable类型的接口，延迟的时间，延迟时间的单位)
        scheduledExecutorService.schedule(new Runnable() {
            @Override
            public void run() {
                System.out.println("延迟三秒执行...");
                System.out.println(System.currentTimeMillis());
            }

        },3,TimeUnit.SECONDS);
        scheduledExecutorService.shutdownNow();

    }
}
