package Arrays.SubArrays;

import java.util.HashSet;

public class KSumSubarray {
    public static void main(String[] args)
    {
        int[] arr={2,2,2,4,6};
        int K=5;
        HashSet<Integer> hs=new HashSet<>();
        int sum=0;
        boolean found=false;
        for(int element:arr)
        {
            sum=sum+element;
            hs.add(sum);
            if(hs.contains(sum-K))
            {
                found=true;
                break;
            }
        }
        System.out.println(found);
    }
}
