package day1118;

//String、StringBuffer、StringBuilder的区别和相同点
/*
*  一、三者都可以对String进行定义和操作
*
* *****(重要)二、StringBuffer和StringBuilder的区别！！和相同点
*
*
*   相同点：两者都定义的String类型的长度都是可变的
*
*   不同点：StringBuffer 更加安全，但是效率低。效率低是因为它是相对于线程的操作
*          StringBuilder 不安全，但是速度更加快速。
*
*               开发中对于二者的选择时，要根据情况来进行选择，如果是多线程任务，那么就优先选择StringBuffer，如果是单线程任务，那么就
*               选择StringBuilder。
*
*               StringBuffer可以定义可改变的String的长度，底层的情况是为定义的String类型分配了16个char[]数组的长度。
*
*               StringBuffer sb = new StringBuffer();  //char[] value = new char[16];底层创建了一个长度为16的char[]型数组
*               !!!!注意：System.out.println(sb.length());//0  这里打印输出的结果可不是16！！打印输出结果的不是value.length()的值
*
*                       区别：String str1 = new String("abc");//char[] value =new char[]{'a','b','c'};
*
*                       //添加操作
*                       StringBuffer sb1 = new StringBuffer();
*                         sb2.append('a');//底层:value[0]='a';
*                         sb2.append('b');//    value[1]='b';
*
*
*
*                       StringBuffer sb2 = new StringBuffer("abc");//3 底层：char[] value = new char["abc".length()+16]
*                         System.out.println(sb2.length());//3
*
*
*                       StringBuffer扩容问题（尽量避免扩容）
*                       针对StringBuffer，因为先前定义的长度是16，如果append添加元素超过了长度16，那么就牵扯到一个扩容问题
*                       默认情况下，扩容为原来的 2 倍+ 2，同时将元素复制到扩容后的新的数组中
*
*                           开发中：建议使用 StringBuffer(int capacity) //自己指定String类型中的长度，避免复制数组。
*                                         StringBuilder(int capacity)//相同的操作
*
* */





public class StringMoreDemo {
    public static void main(String[] args) {
        StringBuffer sb1 = new StringBuffer("abc");
        sb1.append('1'); //添加操作，append中包括很多类型。所以添加的元素可以带引号也可以不带，而且append会自动返回String，
        sb1.append(1);                                //所以可以直接打印输出添加后的string。
        System.out.println(sb1);
        //sb1.delete(2,4);  //删除指定内容   注意！！：delete关键词删除String中的元素时，范围是左闭右开[start,end)
        sb1.replace(2,4,"fuck");//替换语句 replace([start,end),需要替换成的string类型)
        System.out.println(sb1);

    }
}
