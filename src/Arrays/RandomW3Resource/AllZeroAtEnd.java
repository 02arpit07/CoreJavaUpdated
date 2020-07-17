package Arrays.RandomW3Resource;

import java.util.ArrayList;

public class AllZeroAtEnd {
    public static void main(String[] args)
    {
        int[] arr={1,0,2,3,4,0,0,8,6,7,0};
        ArrayList<Integer> al=new ArrayList<>();
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]!=0)
            {
                al.add(arr[i]);
            }
            else{
                count++;

            }
        }
        for(int i=0;i<count;i++)
        {
            al.add(0);
        }
        for(int i=0;i<al.size();i++)
        {
            System.out.print(al.get(i)+" ");
        }
    }
}
