package oopDemo.interFaceDemo4;

public class interCpu implements Cpu{
    @Override
    public String brand() {
        return "inter";
    }

    @Override
    public String hz() {
        return "3000";
    }
}
