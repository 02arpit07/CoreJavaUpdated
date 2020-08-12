package FinalRevision;

import java.util.ArrayList;

//Problem Name-Count Triplets such that one of the numbers can be written
// as sum of the other two
public class CountTriplets4 {
    public static void main(String[] args)
    {
        int[] arr = new int[] { 1,5,3,2 };
        int n = arr.length;
        System.out.println(countWays(arr, n));
    }
    static int countWays(int[] arr,int n)
    {
        ArrayList<Integer> al=new ArrayList<>();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            al.add(arr[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=i;j<n;j++)
            {
                if(i!=j)
                {
                    if(al.contains(arr[i]+arr[j]))
                    {
                        count++;
                    }
                }
            }

        }
        return count;
    }
}
