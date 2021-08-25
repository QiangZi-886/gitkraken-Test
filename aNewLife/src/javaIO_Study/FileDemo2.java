package javaIO_Study;

import java.io.File;


public class FileDemo2 {
    public static void main(String[] args) {
        File file1 = new File("E:\\file.txt");
        //删除指定路径下的文件，结果返回值为Boolean类型
        boolean flag1 = file1.delete();
        System.out.println(flag1?"删除文件成功！！":"删除文件失败！！");
    }
}
