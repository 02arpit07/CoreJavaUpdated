package JavaIO.FileInputStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FISstring {
    public  static void main(String[] args) throws IOException {
        FileInputStream fis=new FileInputStream("src/JavaIO/FileInputStream/Arpit.txt");
        int i=0;
        while((i=fis.read())!=-1)
        {
            System.out.print((char)i);
        }
        fis.close();
    }
}
