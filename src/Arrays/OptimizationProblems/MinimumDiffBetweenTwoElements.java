package Arrays.OptimizationProblems;

import java.util.Arrays;

public class MinimumDiffBetweenTwoElements {
    //Better method will be in O(nlogn)
    public static void main(String[] args)
    {
        int[] arr={30,5,20,7,9,0};
        int mindiff=Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length-1;i++)
        {
            int a=Math.abs(arr[i]-arr[i+1]);
            if(a<mindiff)
            {
                mindiff=a;
            }
        }
        System.out.println(mindiff);
    }
}
//This method does it in O(n^2)
// int[] arr={30,5,20,9};
//        int mindiff=Integer.MAX_VALUE;
//        for(int i=0;i<arr.length;i++)
//        {
//            for(int j=i+1;j<arr.length;j++)
//            {
//                int x=Math.abs(arr[i]-arr[j]);
//
//                if(x<mindiff)
//                {
//                    mindiff=x;
//                }
//            }
//        }
//        System.out.println(mindiff);
