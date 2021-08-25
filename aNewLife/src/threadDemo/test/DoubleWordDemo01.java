package src.threadDemo.test;

/**
 * 使用两种不同的方式来创建线程输出0~100中的偶数
 *      第一种：
 *          继承Thread类
 */
public class DoubleWordDemo01 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<=100;i++){
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+"输出偶数"+"----"+i);
            }
        }
    }

    public static void main(String[] args) {
        DoubleWordDemo01 doubleWord = new DoubleWordDemo01();
        doubleWord.start();
    }
}
