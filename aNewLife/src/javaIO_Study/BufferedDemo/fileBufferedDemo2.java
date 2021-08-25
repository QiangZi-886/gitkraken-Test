package src.javaIO_Study.BufferedDemo;

import java.io.*;

/*
* 使用BufferedOutPutStream实现从程序向文件里写的操作
* */
public class fileBufferedDemo2 {
    public static void main(String[] args) {
        try {
            InputStream fis = new FileInputStream("E:\\20000227.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);

            OutputStream fos = new FileOutputStream("E:\\20210417.txt");
            BufferedOutputStream bos = new BufferedOutputStream(fos);

            byte[] byteCar = new byte[1024];
            int len = 0;
            while ((len = bis.read(byteCar))!=-1){
                //在往文件中写数据的时候哦，很有可能从上一个文件中读到的数据并不是恰好哦1024个字节，
                //所以在写的时候需要加上字节数组下标和最后搬运的字节长度
                bos.write(byteCar,0,len);
            }
            bis.close();
            bos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
