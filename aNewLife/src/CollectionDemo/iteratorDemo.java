package CollectionDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
* 在java代码中包含三种循环的方式
*   do...while
*   while
*   for
* 还有一种增强的for循环的方式，可以简化循环的编写
*
*
*
*   所有的集合类都默认实现了Iterator的接口，实现此接口意味着具备了增强for循环，也就是for-each
*       增强for循环本质上使用的也是iterator的功能
*       方法：
*           iterator()
*           foreach()
*   在iterator的方法中，要求返回一个    Iterator的接口实例
*       此接口中包含了
*           hasNext()
*           next()
*
* ！！！！在使用iterator进行迭代的过程中，如果同时需要删除其中某个元素的时候会报错，并发操作异常，因此如果遍历的同时
*       需要修改元素，建议使用listIterator，
*       listIterator迭代器提供了向前和向后两种遍历方式
*           始终是通过游标cursor和lastRet两个指针来获取元素值及向下索引
*           当使用向前遍历的时候必须要保证指针在迭代器的结尾，否则无法获取结果值
*           当使用compare方法的时候是不会调用equals方法的 
* */
public class iteratorDemo {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        for (int i = 0;i<list.size();i++){
            System.out.println(list.get(i));
        }

        System.out.println("************");

        //Iterator本身是一个迭代器
//        Iterator iterator = list.iterator();

        ListIterator iterator = list.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("*************");

        //集合除了可以向下遍历，还可以向上遍历。但是注意！！必须等遍历的指针知道集合的最下面的时候，才可以向上遍历，否则无法遍历。
        //也就是说，向上遍历是建立在已经向下遍历之后的基础上的。

        while (iterator.hasPrevious()){
            System.out.println(iterator.previous());
        }

        System.out.println("****");

        //增强的for循环
        for (Object i:list){
            System.out.println(i);
        }
    }
}
