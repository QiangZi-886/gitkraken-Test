package day1124;
/*
*IDEA DEBUG调试
*
*/



public class TestStringBuffer {
    public static void main(String[] args) {
        String str = new String();
        str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);
        System.out.println(sb.length());//  4
        System.out.println(sb);//输出   “null”

        StringBuffer sb1 = new StringBuffer(str);//使用构造器把str直接赋值进去会抛出空指针异常
        System.out.println(sb1);
    }
}
