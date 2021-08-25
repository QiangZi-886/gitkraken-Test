package javaIO_Study;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamDemo {
    public static void main(String[] args) {

        String str = "wijglosdflaexsfimkbcndflsi";

        byte[] buffer = str.getBytes();
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(buffer);

        int read = 0;
        while ((read = byteArrayInputStream.read())!=-1){
            byteArrayInputStream.skip(4);
            System.out.print((char) read);
        }

        try {
            byteArrayInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
