package TwoPointerAlgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class PairSum1 {
    public static void main(String[] args)
    {
        int[] arr={12,3,4,6,5,2,0,9,-9};
        int X=0;
        Arrays.sort(arr);
        System.out.print(TwoSum(arr,X));
    }
    static boolean TwoSum(int[] arr,int X)
    {
        int start=0;
        int last=arr.length-1;
        while(start<last)
        {
            if(arr[start]+arr[last]==X)
            {
                return true;
            }
            else if(arr[start]+arr[last]>X)
            {
                last--;
            }
            else {
                start++;
            }
        }
        return false;
    }
}
