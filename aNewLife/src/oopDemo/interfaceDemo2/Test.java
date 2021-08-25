package oopDemo.interfaceDemo2;
/*
* 利用接口实现智能手机和普通手机分别可以实现的功能，把一些特殊的功能划分出来作为接口，实现类来实现接口，根据需要打印出相应的语句
*
*
* */
public class Test {
    public static void main(String[] args) {
        AptitudeHandset aptitudeHandset = new AptitudeHandset();
        aptitudeHandset.brand="智能手机";
        aptitudeHandset.type = "第二代";
        System.out.println(aptitudeHandset.type+aptitudeHandset.brand+"可以");
        aptitudeHandset.call();
        aptitudeHandset.netWorkConn();
        aptitudeHandset.takepictures();
        aptitudeHandset.sendInfo();

        CommonHandset commonHandset = new CommonHandset();
        commonHandset.brand = "普通手机";
        commonHandset.type = "第二代";
        System.out.println(commonHandset.type+commonHandset.brand+"可以");
        commonHandset.call();
        commonHandset.sendInfo();
        commonHandset.playmusic();

    }
}
