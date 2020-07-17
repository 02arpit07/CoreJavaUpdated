package TwoPointerAlgorithm;

import java.util.Arrays;

public class TripletWith0Sum2 {
    public static void main(String[] args)
    {
        int[] arr={1,1,1,0,10,0,10,10,3};
        Arrays.sort(arr);
        System.out.print(TripletSum(arr));
    }
    static boolean TripletSum(int[] arr)
    {
        boolean result=false;
        for(int i=0;i<arr.length-2;i++)
        {
            if(twoSum(arr,-arr[i],i+1))
            {
                return true;
            }
        }
        return  false;
    }
    static  boolean twoSum(int[] arr,int X,int start)
    {
        int end=arr.length-1;
        while(start<end)
        {
            if(arr[start]+arr[end]==X)
            {
                return true;
            }
            else if(arr[start]+arr[end]>X)
            {
                end--;
            }
            else {
                start++;
            }
        }
        return false;
    }
}
