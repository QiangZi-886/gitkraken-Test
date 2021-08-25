package javaIO_Study;

import java.io.FileInputStream;
import java.io.FileOutputStream;
/*
* 把前面的FileInPutStream、FileOutPutStream结合到一起实现把文件从一个盘符搬运到另一个盘符
* */
public class FileIODemo1 {
    public static void main(String[] args) {
        try {
            //小知识：！！！！记录一个程序的执行时间，并转化为毫秒表示
            long startTime = System.currentTimeMillis();
            //分别搭建从文件到程序和从程序到文件的管道
            FileInputStream fis = new FileInputStream("E:\\20000227.txt");
            FileOutputStream fos = new FileOutputStream("E:\\20210227.txt");

            int ch = 0;
            while ((ch=fis.read())!=-1){
                fos.write(ch);//write()方法中有可以直接传int参数的方法
            }
            fis.close();
            fos.close();
            long endTime = System.currentTimeMillis();
            System.out.println("程序的读写共使用了"+(endTime-startTime)+"毫秒");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
