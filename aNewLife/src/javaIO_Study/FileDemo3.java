package javaIO_Study;

import java.io.File;
import java.io.IOException;

public class FileDemo3 {
    public static void main(String[] args) {
        //1、查找指定路径下的文件是否存在
        File file1 = new File("E:\\Z_Test");
        //调用exists()方法查询文件是否存在,结果返回值为boolean类型
        boolean flag1 = file1.exists();
        if (flag1){//返回结果为True，表示文件存在
            System.out.println("您要搜寻的文件已经存在！！");
        }else {//不存在
            file1.mkdir();
            System.out.println("您所需要的文件不存在，但已经创建！！");
        }

        //2、获取指定文件的大小（长度） 注意：由于编码的不同，一个中文汉字的字节数是一个英文字母字节数的3倍
        try {
            File file2 = new File("E:\\20210416.txt");
            file2.createNewFile();
            Long size = file2.length();
            System.out.println("size="+size);
        } catch (IOException e) {
            e.printStackTrace();
        }


        //获取指定文件的名称
        try {
            File file3 = new File("E:\\20210416.txt");
            file3.createNewFile();
            String fileName = file3.getName();
            System.out.println("fileName:"+fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //获取指定文件的路径
        try {
            File file4 = new File("E:\\20210416");
            file4.createNewFile();
            String filePath = file4.getPath();
            System.out.println("filePath:"+filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
