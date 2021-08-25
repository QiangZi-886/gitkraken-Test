package src.threadDemo;

public class RunnableDemo implements Runnable {
    @Override
    public void run() {
        for (int i=1;i<=10;i++){
            System.out.println(Thread.currentThread().getName()+"---------"+i);
        }
    }

    public static void main(String[] args) {

        Runnable runnable = new RunnableDemo();
        Thread thread = new Thread(runnable);
        thread.start();

        //注意，这里的for循环一定要在声明和创建对象以及调用方法之后，如果再调用之前的话，就会每次优先加载此for()循环，优先输出main中的线程
        for (int i=1;i<=5;i++){
            System.out.println(Thread.currentThread().getName()+"==========="+i);
        }
    }
}
