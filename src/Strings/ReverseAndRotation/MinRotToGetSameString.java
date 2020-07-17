package Strings.ReverseAndRotation;

import java.util.Scanner;

public class MinRotToGetSameString {
    public static void main(String[]  args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArpitGetIt(str);
    }
    static void ArpitGetIt(String str)
    {
        int len=str.length();
        StringBuffer sb=new StringBuffer(str);
        sb.append(str);
        String resul="";
        int count=0;
        int flag=0;
        for(int i=0;i<len;i++)
        {
            resul="";
            for(int j=0;j<len;j++)
            {
                resul=resul+sb.charAt(i+j);
            }
            if(resul.equals(str))
            {
                if(flag==1)
                {
                    System.out.println(count);
                    return;
                }
                flag++;
            }
            count++;
            if(count==str.length())
            {
                flag++;
            }
        }
        if(flag==2)
        {
            System.out.print(str.length());
        }
    }
}
//arpitarpit
