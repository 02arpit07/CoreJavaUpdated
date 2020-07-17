package StringCoreJavaBasics;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        char[] ch=sc.next().toCharArray();
        substring(ch,ch.length);
    }
    static void substring(char[] ch,int n)
    {
        int count=0;
        for(int len=1;len<=n;len++)
        {

            for(int i=0;i<=n-len;i++)
            {
                count++;
                int j=i+len-1;
                for(int k=i;k<=j;k++)
                {
                    System.out.print(ch[k]);
                }
                System.out.println();
            }
        }
        System.out.println("total substring in string "+count);
    }
}
