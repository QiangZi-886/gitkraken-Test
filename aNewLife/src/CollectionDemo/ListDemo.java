package CollectionDemo;

import java.util.ArrayList;
import java.util.List;
/*
* List的使用类似于集合Collection，但有所扩展
*
*
* */
public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("a");
        list.add(1);
        list.add("a");
        list.add(true);
        System.out.println(list);
        System.out.println(list.get(2));//获得指定下标的元素
        System.out.println(list.indexOf("a"));//从前往后遍历寻找指定元素并返回数组下标
        System.out.println(list.lastIndexOf("a"));//从后往前
        List of = List.of(1,2,3,4,5);
        System.out.println(of);
    }
}
