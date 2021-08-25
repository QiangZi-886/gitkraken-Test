package javaIO_Study.BufferedDemo;

import java.io.FileWriter;
import java.io.IOException;

/*
* 把字符从程序中写到文件中
* */
public class IODemo2 {
    public static void main(String[] args) {
        try {
            //字符源
            String str = "我想你了";
            //铺设管道
            FileWriter fw = new FileWriter("E:\\me.txt");

            //写入文件
            fw.write(str);
            //关闭流
            fw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
