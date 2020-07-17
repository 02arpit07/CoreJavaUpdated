package StringCoreJavaBasics;

import java.util.Scanner;

public class Typecasting {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        String[] ch=str.split(",");
        for(int i=0;i<ch.length;i++)
        {
            System.out.println(ch[i]);
        }
        int count1=0;
        for(int i=0;i<ch.length-1;i++)
        {
            if(ch[i]==ch[i+1])
            {
                count1++;
            }
        }
        System.out.print(count1);
    }
}
