package javaIO_Study;

import java.io.File;
import java.io.IOException;

public class FileDemo1 {
    public static void main(String[] args) {
        try {
            File file1 = new File("E:\\file.txt");
            //创建一个文件。有则保持不变，没有就新创建
            boolean flag1=file1.createNewFile();
            System.out.println(flag1?"创建成功！":"创建失败！");

            File file2 = new File("E:\\createdirTest");
            //创建文件夹
            boolean flag2=file2.mkdir();
            System.out.println(flag2?"文件夹创建成功！":"文件夹创建失败！");


            File file3 = new File("E:\\My\\Test\\createdirsTest");
            //创建多级文件夹
            boolean flag3=file3.mkdirs();
            System.out.println(flag3?"文件夹创建成功！":"文件夹创建失败！");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
