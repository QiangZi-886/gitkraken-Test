package src.javaIO_Study;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class fileInputStream {
    public static void main(String[] args) {
//        File file1 = new File()
        try {
            //1、在文件和程序之间铺设管道
            FileInputStream fis = new FileInputStream("E:\\20210416.txt");
            //2、打开水龙头
            int ch = 0;
            while ((ch=fis.read())!=-1){
                System.out.print((char)ch);
            }
            //3、关闭水龙头
            fis.close();
        } catch (Exception e) {
            System.out.println("找不到文件");
        }
    }
}
