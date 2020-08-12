package WiproTalentNext;

import java.io.*;
import java.util.*;

public class InputOutputStreams {
    public static void main(String args[])throws Exception{
        FileReader fr=new FileReader("src/WiproTalentNext/demo.txt");

        FileWriter writer = new FileWriter("src/WiproTalentNext/demo.txt");
        BufferedWriter buffer = new BufferedWriter(writer);
        buffer.write("hello world");
        buffer.close();
        System.out.println("Done");

        int i;
        System.out.println("Read it ==>");
        while((i=fr.read())!=-1)
            System.out.print((char)i);
        fr.close();


    }
}
