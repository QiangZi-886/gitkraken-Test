package oopDemo.interFaceDemo3;

public class printMechine implements inkBox,paper{
    @Override
    public void getwriteAndBlackBox() {
        System.out.print("使用黑白打印机");
    }

    @Override
    public void getColorBox() {
        System.out.print("使用彩色打印机");
    }

    @Override
    public void getA4() {
        System.out.println("打印A4纸");
    }

    @Override
    public void getB5() {
        System.out.println("打印B5纸");
    }
}
