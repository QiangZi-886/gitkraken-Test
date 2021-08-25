package CommonClass;
/*
*注意：常量池在1.7之后放置在了堆空间之中（在在之后元数据空间）
*       字符串的使用：
*           1、创建
*               String str = ”abc“;
*               String str2 = new String("abc");
*           2、字符串的本质
*               字符串的本质是字符数组或者叫做字符序列
*               String类使用final修饰，不可以被继承
*               使用equals()方法比较的是字符数组的每一个位置的值（有任何一个不一样就返回false）
*
* */
public class StringDemo {
    public static void main(String[] args) {
        String str = "abc";
        String str2 = new String("abc");
        System.out.println(str==str2);//false
        System.out.println(str.equals(str2));//true
        System.out.println(str.charAt(0));//取字符串（字符数组）中的第一个元素，也就是下标为0的元素
        System.out.println(str.concat("def"));//字符串拼接操作(本质是数组的复制)
        //indexOf,返回指定元素的数组下标
        System.out.println(str.indexOf("a"));
        //substring,有两种使用方法，一种是直接给定起始位置，然后自动遍历到数组的最后一位，另一种是给定起始位置和结束位置。区间为[a,b)
        String s = "abcdefghijklmn";
        System.out.println(s.substring(3));
        System.out.println(s.substring(3,6));
        //将字符串中的大写字母转换为小写字母或者是将小写字母转换为大写字母
        String s1 = "iLOVEyou";
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
    }
}
