package CollectionDemo.ListTestDemo;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Dog d1 = new Dog("大黄","red");
        Dog d2 = new Dog("二黄","black");
        Dog d3 = new Dog("三黄","green");
        List list = new ArrayList();
        list.add(d1);
        list.add(d2);
        list.add(d3);
        System.out.println(list);
        System.out.println(list.size());
        list.remove(d1);
        System.out.println(list);
        Dog d4 = new Dog("四黄","brown");
        list.add(d4);
        System.out.println(list.contains(d4));
    }
}
