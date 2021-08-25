package CollectionDemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
*   1、Set中存放的是无序，唯一的数据
*   2、由于Set中是使用HashMap()存放的是无序的数据，所以不可以使用下表获取元素的值
*   3、使用treeset底层的实现是treemap，利用红黑树来进行实现
*   4、设置元素的时候，如果是自定义对象，回查找对象中的equals和hashcode方法，如果没有，就比较的是地址
*   5、树中的元素是要默认进行排序操作的，如果是基本数据类型，自动比较，如果是引用数据类型的话，需要自定义比较器
*       比较器分类：
*           内部比较器：
*               定义在元素的类中，通过实现comparable接口来进行实现
*           外部比较器：
*               定义在当前类中，通过实现comparator接口来实现，但是要将该比较器传递到集合中
*           注意：！！！外部比较器可以定义成一个工具类，此时所有需要比较的规则如果一致的话，可以复用，而内部比较器只有在存储当前对象的时候才能用
*               如果两者（两个比较器同时存在），默认优先使用外部比较器
* */
public class SetDemo {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("123");
        set.add(1);
        set.add(true);
        System.out.println(set);
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("****************");
        //将while循环改成for循环,推荐使用第二种for循环的方式
        for (Iterator iter = set.iterator();iter.hasNext();){
            System.out.println(iter.next());
        }
    }
}
