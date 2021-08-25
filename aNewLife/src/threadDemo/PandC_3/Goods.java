package src.threadDemo.PandC_3;

/**
 * 使用同步方法解决线程不安全问题。
 *      为什么选择同步方法，因为同步方法(使用synchronized)可以不用指定共享空间，可以直接将方法写在共享空间中，再使用生产者和消费者调用方法
 */
public class Goods {
    private String brand;
    private String name;

    //默认是不存在商品的，如果flag为true，表明共享空间中有值（商品）
    private boolean flag = false;

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
        /**
         * 如果flag=false的话，意味着生产者没有生产商品，此时消费者无法消费，需要让消费者线程进入到阻塞状态，等待生产者生产，当有商品之后，
         * 再开始消费
         */
        if (!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("消费者取走了"+this.getBrand()+"-----"+this.getName());
        flag = false;

        //唤醒生产者去进行生产
        notify();
    }
    //生产者生产商品
    public synchronized void set(String brand, String name){
        //当生产者抢占到CPU资源之后会判断当前对象是否有值，如果有的话，意味着消费者还没有取走商品消费，需要提醒消费者消费。同时
        //当前线程进入阻塞状态，等待消费者取走商品之后,再次生产。如果没有的话，不需要等待，不需要进入阻塞状态，直接生产即可
        if (flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setBrand(brand);
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        this.setName(name);
        System.out.println("生产者生产了"+this.getBrand()+"---"+this.getName());
        //如果代码执行到此处，意味着已经生产完成，需要将flag设置为true
        flag=true;

        //唤醒消费者进行消费
        notify();
    }
}
