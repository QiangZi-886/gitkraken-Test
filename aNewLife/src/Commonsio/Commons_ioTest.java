package Commonsio;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.EmptyFileFilter;

import java.io.File;
import java.util.Collection;

/*
* 添加一个apache的commonsio的jar包，便利的使用其中的某些方法。
*
*
* */
public class Commons_ioTest {
    public static void main(String[] args) {
        long l = FileUtils.sizeOf(new File("test.txt"));
        System.out.println(l);

        Collection<File> files = FileUtils.listFiles(new File("E:\\Git使用\\课程11：Git"), EmptyFileFilter.NOT_EMPTY, null);
        for (File file:files){
            System.out.println(file);
        }
    }
}
