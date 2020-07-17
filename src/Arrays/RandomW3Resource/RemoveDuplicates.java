package Arrays.RandomW3Resource;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] ARGS)
    {
        int[] arr={1,2,3,2,3,4,5,6,7,6,9,10};
        HashSet<Integer> hs=new HashSet<Integer>();
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        for(int i:hs)
        {
            System.out.print(i+" ");
        }
    }
}
