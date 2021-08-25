package CollectionDemo;

import java.util.ArrayList;
import java.util.Collection;
/*
* java集合框架：
*   Collection：存放的是单一值
*       特点：
*           1、可以存放不同的数据类型，而数组只能存放固定类型的数据
*           2、当使用arraylist子类实现的时候，初始化的长度是10，当长度不够的时候会自动进行扩容操作grow()
*       api方法：
*           增加数据的方法：
*           add：要求必须传入的参数是Object对象，因此当写入基本数据类型的时候，包含了自动装箱和自动拆箱的过程
*           addAll:添加另一个集合的所有元素到此集合中
*
*           删除数据的方法：
*           clear：只是清空集合中的元素，但是此集合对象并没有被回收
*           remove:移除集合中指定的元素。传入的是集合中的元素，返回类型是Boolean类型，查看是否删除就直接输出查看原集合
*           removeAll：移除掉集合中的所有元素
*
*           查询数据的方法：
*           contains：判断集合中是否包含指定的元素值  返回Boolean类型
*           containsAll：判断集合中是否包含另一个集合  返回Boolean类型
*           isEmpty:判断集合是否等于空
*           retainAll：若集合中拥有另一个集合的所有元素，则返回True，否则返回false
*           size:返回当前集合的大小
*
*           集合转数组的操作：
*           toArray:将集合转换成数组
*
*
* */
public class CollectionDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add(1);//括号中应该传入一个Object类的对象，但是直接传入
                    //的是一个基本数据类型，实际上在括号里面完成的是 new Integer(1)的操作（自动装箱）
        collection.add(true);
        collection.add("i love ");
        collection.add(1.23);
        System.out.println(collection);
        ((ArrayList)collection).add(3,"you");//在集合数组的指定位置添加元素
        System.out.println(collection);
        Collection collection1 = new ArrayList();
        collection1.add("a");
        collection1.add("b");
        collection1.add("c");
        collection1.add("d");
        collection.addAll(collection1);//在一个集合中添加另一个集合的所有元素
        System.out.println(collection);

        System.out.println(collection.contains("you"));
        System.out.println(collection.containsAll(collection1));
        collection.remove(true);
        System.out.println(collection);

        System.out.println(collection.retainAll(collection1));//返回boolean类型，判断collection中是否包含有collection1

        System.out.println("****************");
        Object[] objects = collection.toArray();

        for (int i=0;i<objects.length;i++){
            System.out.println(objects[i]);
        }

    }
}
