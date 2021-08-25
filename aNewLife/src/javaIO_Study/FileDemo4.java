package javaIO_Study;

import java.io.File;

/*
* 使用递归方法遍历指定目录下的所有文件
* */
public class FileDemo4 {

    public static void showFile(String pathName){//关键字static修饰的这个方法，在后面可以直接调用，不用使用对象.方法
        File f1 = new File(pathName);
        //判断按照指定路径的文件是否是一个文件夹
        boolean flag1 = f1.isDirectory();
        //选择指定文件夹下的所有文件
        if (flag1){
            File[] files = f1.listFiles();
            for (File tempFile:files){
                boolean flag2 = tempFile.isDirectory();
                if (flag2){
                    showFile(tempFile.getPath());
                }else {
                    String filePath = f1.getPath();
                    System.out.println("普通文件----------"+filePath);
                }
            }
        }else {
            String filePath = f1.getPath();
            System.out.println("普通文件----------"+filePath);
        }
    }

    public static void main(String[] args) {
        FileDemo4.showFile("E:\\Z_showFilesTest");
    }
}
