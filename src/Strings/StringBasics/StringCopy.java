package Strings.StringBasics;

import java.util.Scanner;

public class StringCopy {
    public static void main(String[] args)
    {    Scanner sc=new Scanner(System.in);
        char[] str1=sc.next().toCharArray();
        char[]  str2=new char[str1.length];
        copyString(str1,str2);
        System.out.print(String.valueOf(str2));
    }
    static void copyString(char[] str1,char[] str2)
    {
        for(int i=0;i<str1.length;i++)
        {
            str2[i]=str1[i];
        }
    }
}
