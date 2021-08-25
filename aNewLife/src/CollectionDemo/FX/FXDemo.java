package CollectionDemo.FX;



import java.util.ArrayList;
import java.util.List;
/*
* 当做集合统一的一些操作的时候，需要保证集合的类型是统一的，此时需要泛型来进行限制
*   优点：
*       1、数据安全
*       2、获取数据时，效率比较高
*   给集合中的元素设置相同的类型就是基本需求
*       在定义对象的时候，通过<>中设置合理的参数类型来实现
*
* 泛型的高阶运用
*   1、泛型类
*       在定义类的时候，在类名的后面添加<E、V、K、A、B>起到站位的作用，类中的方法的返回值类型和属性的类型(即方法中参数的类型也可以设置)都可以使用
*   2、泛型接口
*       1、在定义接口的时候，可以不填写泛型的类型，此时在创建具体子类对象的时候才决定使用什么类型
*       2、子类在实现泛型接口的时候，指定父类泛型的类型，子类不需要写明泛型类型，此时测试方法中的泛型类型必须要跟子类保持一致
*   3、泛型方法
*       在定义方法的时候，指定方法的返回值和参数是(泛型)自定义的占位符，可以使类名中的T，也可以是自定义的Q，只不过在使用自定义的时候需要使用<Q>
        写在返回值的前面
*   4、泛型的上限
*   5、泛型的下限
* */
public class FXDemo {
    public static void main(String[] args) {
        List<String>list = new ArrayList<String>();
        list.add("mylove");//new String("abc")
        list.add("true");//new Boolean(true)
        list.add("123");//new Integer(123)
        list.add(new Person("zhangsan",18).toString());
        System.out.println(list);

        System.out.println("***************");
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

//        for (Object iter:list){  //此种方法虽然也可以遍历list中的元素，但是对于引用类型Person来说，单独获取Person中的name属性仍会报错
//            Person p = (Person) iter;
//            System.out.println(iter);
//        }
        //两种方式都能输出
        for (String iter:list){
            System.out.println(iter);
        }
        System.out.println("---------------------------------");

        System.out.println("泛型类测试：---------------");
        FXClass<String> fxc = new FXClass<String>();
        fxc.setA("abc");
        fxc.setId(1);
        fxc.show();
//        System.out.println(fxc);


        FXClass<Integer> fxc2 = new FXClass<Integer>();
        fxc2.setId(23);
        fxc2.setA(100);//A的类型是可变的，即在class中设置的类型就叫A，但是实际使用中可以使任何类型
        fxc2.show();
        System.out.println("---------------------");
        FXClass<Person> fxc3 = new FXClass<Person>();
        fxc3.setA(new Person("王富贵",18));
        fxc3.setId(1234);
        fxc3.show();
        System.out.println(fxc3.get());

        System.out.println("泛型接口测试:--------------");

        FXInterfaceSub<Integer> fxi = new FXInterfaceSub();
        fxi.test2(345);

        System.out.println("泛型方法测试：----------------");
        FXMethod<String> fxm = new FXMethod<String>();
        fxm.setT("ttt");
//        fxm.getT();
        fxm.show(123);
        fxm.show(true);
    }
}
