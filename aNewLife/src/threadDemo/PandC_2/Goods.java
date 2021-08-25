package src.threadDemo.PandC_2;

/**
 * 使用同步方法解决线程不安全问题。
 *      为什么选择同步方法，因为同步方法(使用synchronized)可以不用指定共享空间，可以直接将方法写在共享空间中，再使用生产者和消费者调用方法
 *      但synchronized方法只能解决商品和名称对应不上的问题，具体解决方法还需要使用flag标志
 */
public class Goods {
    private String brand;
    private String name;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //消费者获取商品
    public synchronized void get(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者取走了"+this.getBrand()+"-----"+this.getName());

    }
    //生产者生产商品
    public synchronized void set(String brand, String name){
        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了"+this.getBrand()+"---"+this.getName());

    }
}
