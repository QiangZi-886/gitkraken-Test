package oopTest;

public class PersonTest {
    public static void main(String[] args) {
        //创建person类的对象 也叫person类的实体化。。。类似于 Scanner scan=new Scanner(System.in);
        person p1=new person();
        //调用 对象的属性和方法
        //第一 调用对象的属性：“对象.属性”
        p1.name="Jerry";
        p1.isMan=true;
        System.out.println(p1.name);
        System.out.println(p1.isMan);
        //同样的 调用对象的 方法/函数、成员方法
        //“对象.方法”
        p1.eat();            //注：类的成员方法可理解为函数，函数里存在打印语句，所以不用跟前面的成员变量一样需要打印输出来看结果
        p1.sleep();
        p1.talk("English");
        //*****************************************
        //常见第二个对象
        person p2=new person();
        System.out.println(p2.name);//结果为null 可得：创建类的多个对象是共有一套类的独立的属性（非static），即：修改一个对象的属性，不影响另一个对象的属性

        //****************************************
        person p3=p1;
        System.out.println(p3.name);
        p3.age=100;
        System.out.println(p1.age);//此时的p3和p1的首地址值是一样的，都指向堆空间的同一个实体，所以更改p3的属性值，p1的也会改变
        p3.talk("日语");
        p3.food();
    }
}



//类成员的创建
class person{
    //属性或成员变量
    String name;                //在属性中可以使用权限修饰符来给属性划定权限，但局部变量不能使用权限修饰符
    int age;
    boolean isMan;
    //方法或成员方法或函数
    public void eat(){
        System.out.println("人可以吃饭");
    }
    public void sleep(){
        System.out.println("可以睡觉");
    }
    public void talk(String language){     //方法中定义的变量叫做局部变量，包括方法中声明的变量也叫局部变量
        System.out.println("可以交流，使用的是"+ language);
    }
    public void food(){
        String food="老八秘制小汉堡";   //没有默认初始化的局部变量意味着调用之前一定要 显示赋值
        System.out.println("我们都吃"+food);
    }

}
