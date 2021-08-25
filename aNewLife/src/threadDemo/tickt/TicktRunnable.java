package src.threadDemo.tickt;

/**
 * 使用接口的方式，每次只创建了一个共享对象，所有的线程都能够实现共享
 *      1、数据不一致问题
 *          解决方法：使用线程同步
 *
 *
 *
 */
public class TicktRunnable implements Runnable{

    private int ticket = 5;

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {
            if (ticket > 0) {
                System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
            }
        }
    }

        public static void main (String[]args){
            TicktRunnable ticktRunnable = new TicktRunnable();
            Thread t1 = new Thread(ticktRunnable,"A");
            Thread t2 = new Thread(ticktRunnable,"B");
            Thread t3 = new Thread(ticktRunnable,"C");
            Thread t4 = new Thread(ticktRunnable,"D");

            t1.start();
            t2.start();
            t3.start();
            t4.start();
        }
    }
