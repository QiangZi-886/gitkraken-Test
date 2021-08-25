package javaIO_Study.BufferedDemo;

import java.io.*;

public class IODemo4 {
    public static void main(String[] args) {
        try {
//            String str = "我真的想你了";
            Reader fr = new FileReader("E:\\you.txt");
            BufferedReader br = new BufferedReader(fr);

            String str = br.readLine();


            Writer fw = new FileWriter("E:\\me.txt");
            BufferedWriter bw = new BufferedWriter(fw);

            bw.write(str);

            bw.flush();
            //关闭流的顺序跟创建流的顺序相反即可
            bw.close();
            br.close();
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
