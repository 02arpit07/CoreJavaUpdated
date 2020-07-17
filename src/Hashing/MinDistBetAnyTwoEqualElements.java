package Hashing;

import java.util.HashMap;

public class MinDistBetAnyTwoEqualElements {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,2,1,3};
        //Ans should be 2 as minimum distance is between both the 2.
        System.out.println(getMin(arr));

        int a2[] = { 3, 5, 4, 6, 5, 3 };
        System.out.println(getMin(a2));

        int a3[] = { 1, 2, 1, 4, 1 };
        System.out.println(getMin(a3));
    }
   static int getMin(int[] arr)
   {
       int len=arr.length;
       HashMap<Integer,Integer> hm=new HashMap<>();
       int currIndex=0,prevIndex=0;
       int minDist=Integer.MAX_VALUE;
       for(int i=0;i<len;i++)
       {
           if(hm.containsKey(arr[i]))
           {
               currIndex=i;
               prevIndex=hm.get(arr[i]);
               minDist=Math.min((currIndex-prevIndex),minDist);
               hm.put(arr[i],currIndex);
           }
           hm.put(arr[i],i);
       }
       return minDist==Integer.MAX_VALUE?-1:minDist;
   }
}
