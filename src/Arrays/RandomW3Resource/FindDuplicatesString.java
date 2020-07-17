package Arrays.RandomW3Resource;

import java.util.ArrayList;
import java.util.HashMap;

public class FindDuplicatesString {
    public static void main(String[] arhs)
    {
        String[] arr={"abc","bcd","efg","fgh","bcd","ghjk"};
        HashMap<String,Integer> hm=new HashMap<>();
        ArrayList<String> al=new ArrayList<>();
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
        for(String i:hm.keySet())
        {
            int x=hm.get(i);
            if(x>1)
            {
                al.add(i);
            }
        }
        for(String i:al)
        {
            System.out.print(i+" ");
        }

    }
}
