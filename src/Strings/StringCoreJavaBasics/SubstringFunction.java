package StringCoreJavaBasics;

import java.util.Scanner;

public class SubstringFunction {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str="arpit";
        int n=str.length();
        substring(str,n);
    }
    static void substring(String str,int n)
    {
        int count=0;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<=n;j++)
            {
                System.out.println(str.substring(i,j));
                count++;
            }
        }
        System.out.println("total number of substrings possible are "+count);
    }
}
