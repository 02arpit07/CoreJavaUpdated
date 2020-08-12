package JavaIO.Basic;

import java.io.IOException;

public class Ques1 {
    public static  void main(String[] args) throws IOException {
       // System.err.println("Error");

        int i=System.in.read();
        System.out.println((char)i);//Prints first character of string,or num or anything
    }
}
