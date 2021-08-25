package day1224;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Writer {
    public static void main(String[] args){
        FileWriter writer=null;
        BufferedWriter bufferedWriter=null;
        try {
            writer=new FileWriter("E:\\javaprogram\\src\\day1224.text" ,true);
            bufferedWriter=new BufferedWriter(writer);
            String s="Hello World!!!";

            bufferedWriter.write(s);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                bufferedWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
