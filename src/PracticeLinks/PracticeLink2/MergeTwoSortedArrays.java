package PracticeLinks.PracticeLink2;
//2
import java.util.TreeSet;

public class MergeTwoSortedArrays {
    public static void main(String[] args)
    {
        int[] arr={1,4,5,3,2,7};
        int[] arr1={3,2,6,8,9,11};
        TreeSet<Integer> ts=new TreeSet<>();
        for(int i=0;i<arr.length;i++)
        {
            ts.add(arr[i]);
        }
        for(int i=0;i<arr1.length;i++)
        {
            ts.add(arr1[i]);
        }
        for(int a:ts)
        {
            System.out.print(a);
        }
        //convert treeset back to array
        //Object[] result=ts.toArray();
        //for(int i=0;i<result.length;i++)
        //{
          //  System.out.print(result[i]);
        //}
    }
}
