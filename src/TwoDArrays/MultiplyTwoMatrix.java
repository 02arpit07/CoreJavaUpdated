package TwoDArrays;

import java.util.*;
public class MultiplyTwoMatrix {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[][] arr=new int[n][n];
        int[][] arr2=new int[n][n];
        int[][] result=new int[n][n];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                for(int k=0;k<n;k++)
                {
                    result[i][j]+=arr[i][k]*arr2[k][j];
                }
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}
