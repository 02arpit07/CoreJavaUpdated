package Strings.ArithmeticOperations;

import java.util.PriorityQueue;

public class MaxSumAfterK_Negations {
    public static void main(String[] arg)
    {
        int[] arr = {-2, 0, 5, -1, 2};
        int k = 4;
        System.out.println(maxSum(arr, k));
    }
    static int maxSum(int[] arr,int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int x:arr)
        {
            pq.add(x);
        }
        while(k--!=0)
        {
            int temp=pq.poll();
            temp=Math.abs(temp);
            pq.add(temp);
        }
        //int sum=0;
       // for(int i=0;i<arr.length;i++)
        //{
          //  sum=sum+pq.poll();
        //}
        //orinstead of above for loop we can use foreach loop
        int sum=0;
        for(int x:pq)
        {
            sum=sum+x;
        }

        return sum;
    }
}
