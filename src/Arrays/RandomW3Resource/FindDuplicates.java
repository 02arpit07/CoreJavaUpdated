package Arrays.RandomW3Resource;

import java.util.ArrayList;
import java.util.HashMap;

public class FindDuplicates {
    public static void main(String[] arhs)
    {
        int[] arr={1,2,3,4,3,4,3,4,5,6,7,7,8,9};
        HashMap<Integer,Integer> hm=new HashMap<>();
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++)
        {
            if(!hm.containsKey(arr[i]))
            {
                hm.put(arr[i],1);
            }
            else{
                int x=hm.get(arr[i]);
                hm.put(arr[i],x+1);
            }
        }
        for(int i:hm.keySet())
        {
            int x=hm.get(i);
            if(x>1)
            {
                al.add(i);
            }
        }
        for(int i:al)
        {
            System.out.print(i+" ");
        }

    }
}
