package CommonClass;
/*
*   字符串的本质是字符数组，而StringBuffer和StringBuilder是可变字符数组，默认的数组长度为16（2的4次方）
*
*
*   可变字符串 StringBuffer、StringBuilder
*       StringBuffer：线程安全的，效率低。（其中方法都由synchronized()（同步方法）修饰，synchronized()表示一个线程在操作时
*           另外的线程无法访问，自然也会带来效率低下。而StringBuilder可以多线程访问）
*       StringBuilder：线程不安全的，效率高
*
* */
public class StringBufferDemo {
    public static void main(String[] args) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(1.234).append("abc").append(true);
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.capacity());//capacity()方法输出StringBuffer的 容量 16
        //其中StringBuiler的用法和api与StringBuffer一样
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(123.456).append("ilove").append(false);
        System.out.println(stringBuilder);

    }
}
