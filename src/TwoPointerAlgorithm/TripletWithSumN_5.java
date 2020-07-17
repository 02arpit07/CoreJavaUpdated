package TwoPointerAlgorithm;

import java.util.Arrays;

public class TripletWithSumN_5 {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        Arrays.sort(arr);
        int N=25;
        System.out.print(TripletSum(arr,N));
    }
    static boolean TripletSum(int[] arr,int N)
    {
        for(int i=0;i<arr.length-2;i++)
        {
            if(pairSum(arr,i+1,N-arr[i])) {
                return true;
            }
        }
        return false;

    }
    static boolean pairSum(int[] arr,int low,int N)
    {
        int end=arr.length-1;
        while(low<end)
        {
            if(arr[low]+arr[end]>N)
            {
                end--;
            }
            else if(arr[low]+arr[end]<N)
            {
                low++;
            }
            else{
                return true;
            }
        }
        return false;
    }
}
