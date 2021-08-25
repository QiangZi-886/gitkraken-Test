package src.threadDemo.tickt;

/**
 * 使用接口的方式，每次只创建了一个共享对象，所有的线程都能够实现共享
 *      1、数据不一致问题
 *          解决方法：使用线程同步
 *
 *
 *
 */
public class TicktRunnable2 implements Runnable{

    //当前变量不是static，是因为类实现了Runnable接口，而不是继承Thread对象。如果是继承Thread对象，那么变量就要写成static，才能共享
    private int ticket = 5;

    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            //同步代码块解决多线程并发安全问题
             synchronized (this){
                 if (ticket > 0) {      //synchronized()方法括号中需要的参数类型是Object，ticket是int类型，但是可以使用this指向当前对象
                     System.out.println(Thread.currentThread().getName() + "正在出售第" + (ticket--) + "张票");
                 }
             }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

        public static void main (String[]args){
            TicktRunnable2 ticktRunnable = new TicktRunnable2();
            Thread t1 = new Thread(ticktRunnable);
            Thread t2 = new Thread(ticktRunnable);
            Thread t3 = new Thread(ticktRunnable);
            Thread t4 = new Thread(ticktRunnable);

            t1.start();
            t2.start();
            t3.start();
            t4.start();
        }
    }
