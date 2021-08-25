package oopDemo.interFaceDemo4;

public class computer {
    public void show(Cpu cpu,HardDisk hardDisk,Memory memory){
        System.out.println("CPU:"+cpu.brand()+" ,主频："+cpu.hz());
        System.out.println("硬盘："+hardDisk.getVolum());
        System.out.println("内存："+memory.getCapacity());
    }
}
