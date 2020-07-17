package PracticeLinks.PracticeLink1;

import java.util.Scanner;

public class prac1CountFreq {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int count=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(arr[i]==arr[j]&&i!=j)
                {
                    count++;
                    arr[j]=11111;
                }
            }
            if(arr[i]!=11111)
            {
                System.out.println(arr[i]+"occurs "+count+" times");
            }
            count=1;
        }
    }
}
