package Arrays.Rearrangement;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrangeNegPosAlternate {
    public static void main(String[] argss)
    {
        int arr[] = {-1, -3, 2, 4, -5, -7, 6, 8, -9};
        int n = arr.length;
        rearrange(arr,n);
    }
    public static void rearrange(int[] arr,int n)
    {
        Arrays.sort(arr);
        int pos=0;
        int neg=0;
        int i=0;
        for(int b=0;b<arr.length;b++)
        {
            if(arr[b]>0)
                pos++;
            else {
                neg++;
            }
        }
        int x=neg-1;
        int y=n-1;
        int t=neg;
        int[] result=new int[n];
        while (x>=0||y>=t)
        {
            if(x>=0) {
                result[i] = arr[x];
                i++;
                x--;
            }
            if(y>=t) {
                result[i] = arr[y];
                i++;
                y--;
            }
        }
        for(int j=0;j<result.length;j++)
        {
            System.out.print(result[j]+" ");
        }
    }
}
