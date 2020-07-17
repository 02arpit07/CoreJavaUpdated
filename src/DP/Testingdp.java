package DP;

import java.util.Arrays;

public class Testingdp {
    public static void main(String[] args)
    {
        int m=4;
        int n=4;
        int[][] arr=new int[m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(arr[i],-1);
        }
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
