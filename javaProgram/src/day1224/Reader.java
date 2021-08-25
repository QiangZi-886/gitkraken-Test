package day1224;

import java.io.*;

public class Reader {
    public static void main(String[] args){
        FileReader reader= null;
        BufferedReader bufferedReader=null;
        try {
            reader = new FileReader("E:\\javaprogram\\src\\day1224.text");
            bufferedReader=new BufferedReader(reader);
            String s=null;
            while ((s=bufferedReader.readLine())!=null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

