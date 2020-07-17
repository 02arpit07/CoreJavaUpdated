package TwoDArrays;

import java.util.Scanner;

public class ScalarMultiply {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter size of matrix");
        int n =sc.nextInt();
        System.out.println("enter digit you want to multiply your mattrix with");
        int digit=sc.nextInt();
        int[][] arr1=new int[n][n];
        int[][] arr2=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr2[i][j]=digit*arr1[i][j];
            }
        }


        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
    }
}
