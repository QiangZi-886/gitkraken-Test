package oopDemo.interfaceDemo2;

public class CommonHandset extends handSet implements playMusic{
    @Override
    public void sendInfo() {
        System.out.println("发送消息");
    }

    @Override
    public void call() {
        System.out.println("打电话");
    }

    @Override
    public void playmusic() {
        System.out.println("播放音乐");
    }
}
