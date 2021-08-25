package oopDemo.interFaceDemo4;

public class Test {
    public static void main(String[] args) {
        computer c = new computer();
        Cpu cpu = new interCpu();
        HardDisk hardDisk = new SxDisk();
        Memory memory = new jsdMemory();
        c.show(cpu,hardDisk,memory);
    }
}
