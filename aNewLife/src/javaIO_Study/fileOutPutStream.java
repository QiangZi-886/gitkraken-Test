package javaIO_Study;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class fileOutPutStream {
    public static void main(String[] args) {
        try {
            //1、创建准备写入文件的数据
            String data = " No,you will never known it";
            //铺设程序跟文件之间的管道。。FileOutPutStream()方法中append参数如果是true的话就在文件中原有的数据后追加数据，如果为false则覆盖原数据
            FileOutputStream fos = new FileOutputStream("E:\\20000227.txt",true);
            //打开输出流
            byte[] tempBytes = data.getBytes();
            fos.write(tempBytes);
            //关闭输出流
            fos.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
