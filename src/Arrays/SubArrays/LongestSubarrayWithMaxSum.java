package Arrays.SubArrays;

import java.util.HashMap;
//A difficult ques. (get longest length function is tricky)
public class LongestSubarrayWithMaxSum {
    public static void main(String[] args)
    {
        int[] arr={5,-2,-1,3,-4};
        int n =arr.length;
        System.out.println(WrapperFunc(arr,n));
    }
    static int WrapperFunc(int[] arr,int n)
    {
        int k=getMaxSum(arr,n);
       int length= findlengthOfLongestSubarray(arr,n,k);
       return length;
    }
    static int getMaxSum(int[] arr,int n)
    {
        int maxSofar=Integer.MIN_VALUE;
        int maxEndinghere=0;
        for(int i=0;i<n;i++)
        {
            maxEndinghere=maxEndinghere+arr[i];
            if(maxEndinghere>maxSofar)
            {
                maxSofar=maxEndinghere;
            }
            if(maxEndinghere<0)
            {
                maxEndinghere=0;
            }
        }
        return maxSofar;
    }
    static int findlengthOfLongestSubarray(int[] arr,int n,int k)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int sum=0,maxlen=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
            if(sum==k)
            {
                maxlen=i+1;
            }
            if(hm.containsKey(sum))
            {
                hm.put(sum,i);
            }
            if(hm.containsKey(sum-k))
            {
                if(maxlen<(i-hm.get(sum-k)))
                {
                    maxlen=(i=hm.get(sum-k));
                }
            }
        }
        return maxlen;
    }

}
