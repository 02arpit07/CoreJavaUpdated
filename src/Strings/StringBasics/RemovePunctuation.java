package Strings.StringBasics;

import java.util.Scanner;

public class RemovePunctuation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
            str=str.replaceAll("\\p{Punct}","");
            System.out.println(str);

    }
}
