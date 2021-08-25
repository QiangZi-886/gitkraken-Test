package javaIO_Study.BufferedDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

/*
* 使用BufferedReader对文件实现读操作
* */
public class IODemo3 {
    public static void main(String[] args) {
        try {
            //指定文件路径，并铺设管道
            Reader fr = new FileReader("E:\\me.txt");
            BufferedReader br = new BufferedReader(fr);

            //文件的读操作
            String str = br.readLine();
            System.out.print(str);
            //关闭流
            fr.close();
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
