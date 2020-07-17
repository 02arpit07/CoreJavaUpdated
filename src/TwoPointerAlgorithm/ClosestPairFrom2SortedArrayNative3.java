package TwoPointerAlgorithm;

import java.util.Arrays;

public class ClosestPairFrom2SortedArrayNative3 {
    public static void main(String[] args)
    {
        int ar1[] = {1, 4, 5, 7};
        int ar2[] = {10, 20, 30, 40};
         int x = 50;
        getPair(ar1,ar2,x);
    }
    static void getPair(int[] ar1,int[] ar2,int x)
    {
        int minDiff=Integer.MAX_VALUE;
        int res=0;
        int first=0;
        int second=0;
        for(int i=0;i<ar1.length;i++)
        {
            for(int j=0;j<ar2.length;j++)
            {
                res=Math.abs(ar1[i]+ar2[j]-x);
                if(minDiff>res)
                {
                    minDiff=res;
                    first=ar1[i];
                    second=ar2[j];
                    res=0;
                }
            }
        }
        System.out.print(first+" and  "+second);
    }
}
