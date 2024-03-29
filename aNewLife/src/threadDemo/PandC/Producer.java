package src.threadDemo.PandC;

/**
 * 生产者。不断生产商品，将生产的商品放到共享空间中
 */
public class Producer implements Runnable {
    private Goods goods;

    public Producer(){

    }

    public Producer(Goods goods) {
        this.goods = goods;
    }

    @Override
    public void run() {
        for (int i=0;i<10;i++){
            if (i%2==0){
                goods.setBrand("娃哈哈");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.setName("矿泉水");
            }else {
                goods.setBrand("旺仔");
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                goods.setName("小馒头");
            }
            System.out.println("生产者生产了"+this.goods.getBrand()+"---"+this.goods.getName());
        }
    }
}
