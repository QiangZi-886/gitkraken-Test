package CollectionDemo;

import java.util.Vector;
/*
*   1、Vector也是List接口的一个子类实现
*   2、Vector和ArrayList一样，底层都是使用数组实现
*   3、区别：
*       （1）：ArrayList是线程不安全的，效率高；Vector是线程安全的，效率低
*                   （因为Vector的indexOf方法中有synchronized关键字）
*       （2）：ArrayList在进行扩容的时候，是扩容1.5倍,（一倍加上 >>1 右移一位，除以二，所以是1.5倍）Vector扩容的时候，扩容为原来的两倍
*
* 
* */
public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("abc");
        vector.add(123);
        vector.add(true);
        System.out.println(vector);
    }
}
