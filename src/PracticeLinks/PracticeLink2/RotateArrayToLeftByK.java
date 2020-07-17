package PracticeLinks.PracticeLink2;

import java.util.Scanner;

public class RotateArrayToLeftByK {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println("how much rotated do you want your array to be ");
        int k=sc.nextInt();
        printArr(arr);
        rotateArr(arr,k);
        printArr(arr);
    }
    public static void printArr(int[] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void rotateArr(int[] arr,int k)
    {
        while(k--!=0)
        {
            int first=arr[0];
            for(int i=0;i<arr.length-1;i++)
            {
                arr[i]=arr[i+1];
            }
            arr[arr.length-1]=first;
        }
    }
}
