package oopDemo.interfaceDemo;

public class LockDoor extends Door implements Lock{
    public void openLock(){
        System.out.println("开锁");
    }
    public void closeLock(){
        System.out.println("关锁");
    }

    @Override
    public void openDoor() {
        System.out.println("开门");
    }

    @Override
    public void closeDoor() {
        System.out.println("关门");
    }
}
