package javaIO_Study.BufferedDemo;

import java.io.BufferedReader;
import java.io.FileReader;

/*
* 使用字符流对文件和程序实现读写操作。
*
* 注意！！！在使用write()方法对文件进行写操作的时候关于  flush()方法的使用： 什么时候使用flush()、什么时候不使用flush()！！
* （在IO的使用中，如果没有缓冲区close()方法就相当于在流的结束之前的flush()，相对于小文件，其实close和flush的效果是一样的）
*   1、最保险的方法是，在输出流关闭之前，每次都使用flush()刷新一下，然后再关闭
*   2、当某一个输出流对象中带有缓冲区的时候，就需要进行flush刷新缓冲区的操作（大文件）
*
* */
public class IODemo1 {
    public static void main(String[] args) {
        try {
            //确定一个指定路径的数据源
            //铺设管道
            FileReader fr = new FileReader("E:\\me.txt");
            //读文件
            char[] charCar = new char[1024];//一次读取1024个字符
            int len = 0;
            //charCar 字符数组缓冲区
            while ((len = fr.read(charCar))!=-1){
                //字符数组转换成字符串
                String str = new String(charCar,0,len);
                System.out.println(str);
            }

            //关闭流
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
