package src.threadDemo.test;

/**
 *
 *      第二种实现输出0~100中的偶数的方法：
 *          实现Runnable()的接口
 *
 */
public class DoubleWordDemo02 implements Runnable{
    @Override
    public void run() {
        for (int i = 0;i<=100;i++){
            if (i%2==0){
                System.out.println(Thread.currentThread().getName()+"输出偶数"+"----"+i);
            }
        }
    }

    public static void main(String[] args) {
        DoubleWordDemo02 doubleWord = new DoubleWordDemo02();
        Thread thread = new Thread(doubleWord);
        thread.start();
    }
}
