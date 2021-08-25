package oopDemo.interfaceDemo2;

public class AptitudeHandset extends handSet implements TakePictures,NetWork{
    @Override
    public void netWorkConn() {
        System.out.println("连接网络");
    }

    @Override
    public void takepictures() {
        System.out.println("拍照");
    }

    @Override
    public void sendInfo() {
        System.out.println("发送信息");
    }

    @Override
    public void call() {
        System.out.println("打电话");
    }
}
