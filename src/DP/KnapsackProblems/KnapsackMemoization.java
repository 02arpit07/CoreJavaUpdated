package DP.KnapsackProblems;

import java.util.Arrays;
//I have done his using memoization
public class KnapsackMemoization {
    static int[][] t=new int[5][8];
    //we want to calculate maximum.
    public static void main(String[] args)
    {
        for(int i=0;i<5;i++)
        {
            Arrays.fill(t[i],-1);
        }
        int[] wt={1,3,4,5};
        int[] val={1,4,5,7};
        int W=7;
        int maxProfit=Knapppsack(wt,val,W,val.length);
        System.out.print(maxProfit);
    }
    static int Knapppsack(int[] wt,int[] val,int W,int n)
    {
        if(W==0||n==0)
        {
            return 0;
        }
        if(t[n][W]!=-1)
        {
            return t[n][W];
        }
        if(wt[n-1]<=W)
        {
            return t[n][W]=Math.max(val[n-1]+Knapppsack(wt,val,W-wt[n-1],n-1),Knapppsack(wt,val,W,n-1));
        }
        else
        {
            return t[n][W]=Knapppsack(wt,val,W,n-1);
        }
    }
}
