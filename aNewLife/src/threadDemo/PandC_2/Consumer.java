package src.threadDemo.PandC_2;

/**
 * 从共享空间中取走商品
 */
public class Consumer implements Runnable {
    private Goods goods;

    public Consumer(){

    }

    public Consumer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            goods.get();
        }
    }
}
