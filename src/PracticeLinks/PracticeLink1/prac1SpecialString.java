package PracticeLinks.PracticeLink1;

import java.util.Scanner;

public class prac1SpecialString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        String[] strArr=new String[n];
        for(int i=0;i<n;i++)
        {
            strArr[i]=sc.next();
        }
        System.out.println(countSpecString(strArr,n));
    }
    static int countSpecString(String[] a,int n)
    {
        int count=0;
        int flag=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<3;j++)
            {
                char ch=a[i].charAt(j);
                if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
                {
                    count++;
                    flag=1;
                    break;
                }
            }
            if(flag==0) {
                for (int j = a[i].length() - 1; j > a[i].length() - 3; j++) {
                    char ch = a[i].charAt(j);
                    if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                        count++;
                        break;
                    }
                }
            }
        }
        return count;
    }
}
