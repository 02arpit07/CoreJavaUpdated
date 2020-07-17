package Strings.JavaStrings;

import java.util.Scanner;

public class JavaCompareToLexicographically {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str="Arpit";
        String str1="arpita";
        String str2="A";
        String str3="C";
        System.out.println(str2.compareTo(str3));
        System.out.println(str3.compareTo(str2));


        System.out.println(str.compareTo(str1));

    }
}
