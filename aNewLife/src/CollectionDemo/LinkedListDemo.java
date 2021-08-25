package CollectionDemo;

import java.util.LinkedList;
/*
* LinkedList拥有更加丰富的函数实现方法，需要时查询api即可
*
* */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.add("i love");
        linkedList.add(false);
        linkedList.add(123);
        System.out.println(linkedList);
        linkedList.addFirst(111);
        System.out.println(linkedList);
        linkedList.addLast("you");
        System.out.println(linkedList);//addLast()从后插入的方法与直接add()方法一样，add()方法有返回值但是addLast没有返回值
        System.out.println(linkedList.element());//获取linkedList链表中第一个元素
        linkedList.offer("!!!");//也是向LinkedList中添加元素
        System.out.println(linkedList);

    }
}
