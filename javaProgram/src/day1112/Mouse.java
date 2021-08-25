package day1112;

public class Mouse implements Usb{  //这里如果不来实现接口中定义的方法的话程序就会爆错. (是必须要进行实现)
    @Override
    public void dataTransfer() {
        System.out.println("鼠标用来点击屏幕");
    }
}
