package Strings.JavaStrings;

import java.util.*;



public class BiggestStringInLength {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] str=new String[n];
        for(int i=0;i<n;i++)
        {
            str[i]=sc.next();
        }
        int maxLen=0;
        String s="";
        for(String a:str)
        {
            if(a.length()>maxLen)
            {
                maxLen=a.length();
                s=a;
            }
        }
        System.out.print(s);
    }
}
