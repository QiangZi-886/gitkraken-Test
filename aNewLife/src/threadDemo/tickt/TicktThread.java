package src.threadDemo.tickt;

/**
 * 此时出现的问题：
 *      1、每次在启动线程对象的时候都会创建自己对象的属性值，相当于每个线程操作自己，没有真正意义上的实现共享
 *          解决方法：将共享对象、共享变量设置成static
 *      2、每次访问共享对象的时候，数据不一致了
 *          解决方法：使用线程同步
 *
 *
 *
 */
public class TicktThread extends Thread{

    //private int ticket = 5;
    static private int tickt = 5;
    @Override
    public void run() {
        for (int i  = 0;i<100;i++){
            synchronized (this){        //同步代码块方法实现多线程的同步
                if (tickt>0){
                    System.out.println(Thread.currentThread().getName()+"正在出售第"+(tickt--)+"张票");
                }
            }
        }
    }

    public static void main(String[] args) {
        TicktThread t1 = new TicktThread();
        TicktThread t2 = new TicktThread();
        TicktThread t3 = new TicktThread();
        TicktThread t4 = new TicktThread();


        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
