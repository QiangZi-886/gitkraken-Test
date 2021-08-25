package oopDemo.interfaceDemo;
/*
*       final关键字：
*         当final修饰常量时，表示不可修改
*         当final修饰方法时，表示不可重写
*         当final修饰类时，表示不能被继承
*
*
* */
public interface Lock {
     void openLock();     //接口中的方法都是抽象方法，即使不写，也是默认的public abstract修饰，其中public访问修饰符不可更改
     void closeLock();   //接口不可以被实例化！

     static final int a=100;     //注意：接口中的属性都是静态属性，即可以直接使用类名进行调用。其中接口中的属性是一定要进行赋值的
                                 //接口中的属性值是static final的，即使不加上访问修饰符和final，它在jvm编译时也会自动补全
}
