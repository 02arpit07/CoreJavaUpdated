package Hashing;

import java.util.HashMap;

public class FirstElemOccuringKtimes {
    public static void main(String[] args)
    {
        int arr[] = {1, 7, 4, 3, 4, 8, 7};
        int n = arr.length;
        int k = 2;
        System.out.println(firstElement(arr, n, k));
    }
    public static int firstElement(int[] arr,int n,int k)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int a=0;
        for(int i=0;i<n;i++)
        {
            if(!hm.containsKey(arr[i])) {
                hm.put(arr[i], a + 1);
            }
            else{
                int x=hm.get(arr[i]);
                hm.put(arr[i],x+1);

            }
        }
        int send=0;
        for(int i=0;i<n;i++)
        {
            int res=hm.get(arr[i]);
            if(res==k)
            {
                send=arr[i];
                break;
            }
        }
        return send;
    }
}
