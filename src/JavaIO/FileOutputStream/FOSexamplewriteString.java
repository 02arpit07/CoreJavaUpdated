package JavaIO.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSexamplewriteString {
    public static  void main(String[] args) throws IOException ,FileNotFoundException{
        FileOutputStream fos=new FileOutputStream("src/JavaIO/FileOutputStream/Fosexample2.txt");
        String str="My name is Arpit";
        byte[] arr= str.getBytes();
        fos.write(arr);
        fos.close();
        System.out.print("you are done");
    }
}
