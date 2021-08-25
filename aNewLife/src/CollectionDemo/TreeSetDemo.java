package CollectionDemo;

import java.util.Comparator;
import java.util.TreeSet;
/*
* TreeSet：涉及到树的概念时，一般都会默认的进行排序，类似的，像TreeSet，它的底层是使用了TreeMap()，RED-BLACK红黑树的排序方法，
* 红黑树是二叉树，也叫平衡树。
*
*
* */
public class TreeSetDemo implements Comparator<Person> {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add(12);
        treeSet.add(1);
        treeSet.add(25);
        System.out.println(treeSet);

        System.out.println("*************内部比较器，按照名字长度比较********");
        //内部比较器，按照名字长度来进行比较
        TreeSet treeSet1 = new TreeSet();
        treeSet1.add(new Person("maliu",23));
        treeSet1.add(new Person("zhangsan",23));
        treeSet1.add(new Person("lisi",18));
        System.out.println(treeSet1);

        System.out.println("**********下面是外部比较器，按照年龄大小来进行比较*************");

        TreeSet treeSet2 = new TreeSet(new TreeSetDemo());//传入一个不在Person元素类中，而是在TreeSetDemo中的一个外部比较器
        treeSet2.add(new Person("maliu",24));//同时传入的有Person的内部比较器和TreeSetDemo的内部比较器，但是默认优先使用外部比较器
        treeSet2.add(new Person("wangwu",20));
        treeSet2.add(new Person("boxi",21));
        treeSet2.add(new Person("zhangsan",17));
        treeSet2.add(new Person("lisi",18));
        System.out.println(treeSet2);

    }

    /*
    * 此比较器按照年龄大小来比较
    *
    * */
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getAge()>o2.getAge()){
            return 1;
        }else if (o1.getAge()<o2.getAge()){
            return -1;
        }else {
            return 0;
        }
    }
}
