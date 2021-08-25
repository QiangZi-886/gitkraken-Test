package oopDemo.InnerDemo2;

public class NoNameInnerClassDemo {
    public static void main(String[] args) {
        new Thread(new Runnable() { //其中，Runnable是一个接口。看上去像是new了一个接口，其实是new 了一个接口的实现类。
            @Override
            public void run() {

            }
        });
    }
}


//类似执行了下面的操作。
//class runner implements Runnable{
//
//    @Override
//    public void run() {
//
//    }
//}
