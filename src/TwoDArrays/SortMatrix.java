package TwoDArrays;

import java.util.Arrays;

public class SortMatrix {
    public static void main(String[] args)
    {
        int mat[][] = { { 5, 4, 7 },
                { 1, 3, 8 },
                { 2, 9, 6 } };
        int n=3;
        print(mat,n);
        sortMatrix(mat,n);
        System.out.println("Sorted matrix is -- ");
        print(mat,n);
    }
    static void sortMatrix(int[][] mat,int n)
    {
        int k =0;
        int size=n*n;
        int[] arr=new int[size];
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                arr[k]=mat[i][j];
                k++;
            }
        }
        Arrays.sort(arr);
        k=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                mat[i][j]=arr[k];
                k++;
            }
        }
    }
    static void print(int[][] mat,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}

