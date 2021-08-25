package oopDemo.interfaceDemo;

public class LockDoorTest {
    public static void main(String[] args) {
        LockDoor ld = new LockDoor();
        ld.openDoor();
        ld.closeDoor();
        ld.openLock();
        ld.closeLock();

        System.out.println(LockDoor.a);//这里使用的不是对象调用，而是使用的类名进行调用，所以接口中的属性值是！静态常量！(static final)
    }
}
