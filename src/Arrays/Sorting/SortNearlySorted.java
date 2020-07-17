package Arrays.Sorting;

import java.util.Iterator;
import java.util.PriorityQueue;

//Sort a nearly sorted (or K sorted) array
//Given an array of n elements, where each element is at most k away from its target position,
// devise an algorithm that sorts in O(n log k) time. For example, let us consider k is 2, an
// element at index 7 in the sorted array, can be at indexes 5, 6, 7, 8, 9 in the given array.
public class SortNearlySorted {
    //we can either use insertion sort or priority queue method.here we are going to do pq.
    public static void main(String[] args)
    {
        int k = 3;
        int arr[] = { 2, 6, 3, 12, 56, 8 };
        int n = arr.length;
        kSort(arr, n, k);
        printkaro(arr,n);

    }
    static void kSort(int[] arr,int n,int k)
    {
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int i=0;i<k+1;i++)
        {
            pq.add(arr[i]);
        }
        int index=0;
        for(int i=k+1;i<n;i++)
        {
            arr[index++]=pq.poll();
            pq.add(arr[i]);
        }
        Iterator<Integer> itr=pq.iterator();
        while(itr.hasNext())
        {
            arr[index++]=pq.poll();
        }
    }
    static void printkaro(int[] arr,int n)
    {
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
