package oopDemo.innerDemo;
/*
*   内部类（理解成一个普通的成员变量，只不过此变量使用class来修饰的）：
*       一个java文件中可以包含多个class文件，但是只能有一个public class文件
*       如果一个类定义在一个类的内部，此时可以称之为内部类。（可以当成当前类的一个成员属性）
*   使用：
*       创建内部类的时候，跟之前使用的方法不一样，内部类的前面需要使用外部类来进行修饰：
*       InnerClassDemo.InnerClass inner = new InnerClassDemo().new InnerClass();
*   特点：
*       1、内部类可以方便的访问外部类的私有属性
*       2、外部类不能 直接 访问内部类的私有属性或方法（需要新建 new之后才能访问）
*       3、内部类中不能定义静态属性
*       4、如果想访问外部相同属性名的属性时，需要使用外部类名.this.属性名。注意！！this关键字不能省，因为成员属性一旦没有定义成私有常量
*          那么使用这种 类名.属性 的访问手段就是错误的。
*   分类：
*       匿名内部类：当定义了一个类，实现了某个接口，在使用过程中只需要使用一次，没有其他用途，其考虑到代码编写的简洁，可以考虑不创建具体的
*               类，而采用new interface（）{添加未实现的方法}---就叫做匿名内部类
*       静态内部类：在内部类中可以定义静态内部类，使用static关键字进行修饰，使用规则：外部类.内部类 类的引用名称 = new 外部类.内部类();
*
*       方法内部类：在外部类的方法中，也可以定义类，此时就叫方法内部类 （了解即可）方法内部类的作用域就只存在于当前方法体当中。所以在
*                 方法内部类的使用时，需要在方法体内new方法内部类的对象。
*
*
* */
public class TestInnerClass {
    public static void main(String[] args) {
        InnerClassDemo innerClassDemo = new InnerClassDemo();
        innerClassDemo.show();
        System.out.println(innerClassDemo.getName());

        //新建一个内部类：
        InnerClassDemo.InnerClass inner = new InnerClassDemo().new InnerClass();
        inner.test();
    }
}
