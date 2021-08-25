package src.threadDemo.test;

public class ThreadApiDemo {
    public static void main(String[] args) {
        //获取当前线程对象
        Thread thread = Thread.currentThread();
        //获取当前线程的名称
        System.out.println(thread.getName());
        //获取线程的id
        System.out.println(thread.getId());

        //获取线程的优先级,在一般的系统中范围是0~10的值，如果没有经过设置的话，就是默认值5。有些系统是0~100
        System.out.println(thread.getPriority());

        //设置线程的优先级
        /**
         * 优先级越高不一定优先执行！！！只是优先执行的概率比较大而已！！
         */
        thread.setPriority(10);
        System.out.println(thread.getPriority());

        ThreadApiDemo threadApiDemo = new ThreadApiDemo();
        Thread t1 = new Thread(thread);
        t1.start();
        //判断当前线程是否存活
        System.out.println(t1.isAlive());
    }
}
