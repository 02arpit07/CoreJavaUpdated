package Arrays.Sorting;
import java.util.*;
public class AlternativeSorting {
    public static void main(String[] args)
    {
        int arr[] = {7, 1, 2, 3, 4, 5, 6};
        Arrays.sort(arr);
        int l=0;
        int r=arr.length-1;
        int[] arr1=new int[arr.length];
        int i=0;
        while(l<r)
        {
            arr1[i]=arr[r];
            i++;
            arr1[i]=arr[l];
            i++;
            l++;
            r--;
        }
        if(l==r)
        {
            arr1[i]=arr[l];
        }
        for(int j=0;j<arr1.length;j++)
        {
            System.out.print(arr1[j]+" ");
        }
    }
}
