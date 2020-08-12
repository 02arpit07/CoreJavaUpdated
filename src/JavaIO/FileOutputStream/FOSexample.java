package JavaIO.FileOutputStream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FOSexample {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos=new FileOutputStream("src/JavaIO/FileOutputStream/FOSexample.txt");
        fos.write(100);
        fos.close();
        System.out.print("succeesss");
    }

}
