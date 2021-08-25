package oopDemo.interFaceDemo4;

public class amdCpu implements Cpu{
    @Override
    public String brand() {
        return "AMD";
    }

    @Override
    public String hz() {
        return "1000";
    }
}
