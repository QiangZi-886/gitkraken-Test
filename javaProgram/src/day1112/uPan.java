package day1112;

public class uPan implements Usb,DoorBell{
    public void dataTransfer(){
        System.out.println("u盘用来传输数据");
    }

    @Override
    public void photo() {
        System.out.println("您的照片已存储");
    }
}
