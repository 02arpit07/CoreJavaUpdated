package PracticeLinks.PracticeLink1;

import java.util.Scanner;

public class prac1RightCircularRotation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int rotation=sc.nextInt();
        int querysize=sc.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] qarr=new int[querysize];
        for(int i=0;i<querysize;i++)
        {
            qarr[i]=sc.nextInt();
        }
        while(rotation--!=0)
        {
            int temp=arr[size-1];
            for(int i=size-1;i>0;i--)
            {
                arr[i]=arr[i-1];
            }
            arr[0]=temp;
        }
        for(int i=0;i<size;i++)
        {
            System.out.println(arr[i]);
        }
        System.out.println("-----------");
        for(int i=0;i<querysize;i++)
        {
            System.out.println(arr[qarr[i]]);
        }
    }
}
