package JavaIO;

import java.io.*;

public class BufferedOutputStreamExample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fs=new FileOutputStream("src/JavaIO/Javatpoint.txt");
        BufferedOutputStream bos=new BufferedOutputStream(fs);
        String str="Welcome to javatpoint sdfghj";
        byte[] arr=str.getBytes();
        bos.write(arr);
        bos.flush();
        bos.close();
        fs.close();
        System.out.print("successs");
    }
}
