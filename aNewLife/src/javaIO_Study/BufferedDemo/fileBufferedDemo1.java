package javaIO_Study.BufferedDemo;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/*
* 字节缓冲输入流 BufferedInPutStream:
*       在设置妥当的情况下，可以添加一个图形用户界面，实现大型文件Copy的更快搬运
* */
public class fileBufferedDemo1 {
    public static void main(String[] args) {
        try {
            long startTime = System.currentTimeMillis();
            InputStream fis = new FileInputStream("E:\\20210416.txt");
            //铺设管道
            BufferedInputStream bis = new BufferedInputStream(fis);
            //需要的参数是InputStream类型,所以需要提前创建一个InPutStream类型的对象，并为其设置好路径

            //打开流
//            int ch = 0;
//            while ((ch = bis.read())!=-1){
//                System.out.print((char)ch);
//            }
            //还可以读一些大文件，但是不用打印到控制台，间接展示一次搬运字节的数量
            byte[] byteCar = new byte[1024*1024];//1024代表1KB,1024*1024代表1MB,1024*1024*1024代表一次搬运1GB
            int len = 0;
            while ((len = bis.read(byteCar))!=-1){//设置读取字节，每次读取的字节数量，并赋值给len，在控制台显示输出，直到文件被读完
                System.out.println(len);
            }
            //关闭流
            bis.close();
            long endtTime = System.currentTimeMillis();
            System.out.println("读此文件共使用了"+(endtTime-startTime)+"毫秒!!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
