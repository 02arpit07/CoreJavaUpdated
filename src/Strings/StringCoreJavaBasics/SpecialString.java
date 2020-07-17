package StringCoreJavaBasics;

import java.util.Scanner;

//print the number of strings which are special (special here means which do  not have vowels in first
// and last three alphbets of it)
public class SpecialString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String strArr[]=new String[n];
        for(int i=0;i<n;i++)
        {
            strArr[i]=sc.next();
        }
        System.out.println(specialString(strArr,n));

    }
    static int specialString(String strArr[],int n)
    {
        int i,j,count=0,flag=0;
        for(j=0;j<n;j++)
        {
            for(i=0;i<3 && i<strArr[j].length();i++)
            {
                char ch=(strArr[j].charAt(i));
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                    count++;
                    flag=1;
                    break;
                }
            }
            if(flag==0)
            {
                int d=1;
                for(i=strArr.length;i>=0&&i>strArr[j].length()-3;i--)
                {
                    char ch=(strArr[j].charAt(i));
                    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                    {
                        count++;
                        break;
                    }
                    d--;
                }
            }
            flag=0;
        }
        return n-count;
    }

}
