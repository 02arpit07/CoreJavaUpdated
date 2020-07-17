package Arrays.RandomW3Resource;

import java.util.Arrays;

public class PairOfElemEqualToASum {
    public static void main(String[] args)
    {
        int arr[] = { 2, 3, 4, -2, 6, 8, 9, 11 };
        int sum=6;
        //For our solution we have to sort our array first
        Arrays.sort(arr);
        getAllPairs(arr,sum);
    }
    public static void getAllPairs(int[] arr,int sum)
    {
        int i=0;
        int j=arr.length-1;
        while(i<j)
        {
            if(arr[i]+arr[j]==sum)
            {
                System.out.println("("+arr[i]+","+arr[j]+")");
            }
            if(arr[i]+arr[j]>sum)
            {
                j--;
            }
            else{
                i++;
            }

        }
    }
}
