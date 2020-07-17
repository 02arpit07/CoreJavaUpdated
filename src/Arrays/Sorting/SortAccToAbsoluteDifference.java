package Arrays.Sorting;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
//In this code we have to subtract X which is particular given number from each element of array..
//And then sort out array according to the new values.the values should be absolute.
public class SortAccToAbsoluteDifference {
    public static void main(String[] args)
    {
        int[] arr={10, 5, 3, 9 ,2};//new sorted array={5,9,10,3,2}
        int len=arr.length;
        int X=7;
        rearrange(arr,len,X);
        printArr(arr,len);
    }
    static void rearrange(int[] arr,int len,int X)
    {
        TreeMap<Integer, ArrayList<Integer>> tm=new TreeMap<>();
        for(int i=0;i<len;i++)
        {
            int diff=Math.abs(arr[i]-X);
            if(tm.containsKey(diff))
            {
                ArrayList<Integer> al=tm.get(diff);
                al.add(arr[i]);
                tm.put(diff,al);
            }
            else{
                ArrayList<Integer> al=new ArrayList<>();
                al.add(arr[i]);
                tm.put(diff,al);
            }
        }
        int index=0;
        for(Map.Entry entry:tm.entrySet())
        {
            ArrayList<Integer> al=tm.get(entry.getKey());
            for(int i=0;i<al.size();i++)
            {
                arr[index]=al.get(i);
                index++;
            }
        }

    }
    static void printArr(int[] arr,int len)
    {
        for(int i=0;i<len;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
