package Hashing;

import java.util.HashSet;

//USING HASHSET
public class ArraySubsetHashh {
    public static void main(String[] args)
    {
        int[] arr1={1,4,2};
        int[] arr2={1,4,2};
        int m=arr1.length;
        int n =arr2.length;
        if(checksubset(arr1,arr2,m,n))
        {
            System.out.println("Yes it is subset");
        }
        else{
            System.out.println("Not a subset");
        }
    }
    public static boolean checksubset(int[] arr1,int[] arr2,int m,int n)
    {
        if(n>m)
        {
            return false;
        }
        else {
            HashSet<Integer> hs = new HashSet<>();
            for (int i = 0; i < m; i++) {
                if (!hs.contains(arr1[i])) {
                    hs.add(arr1[i]);
                }
            }
            for (int i = 0; i < n; i++) {
                if (!hs.contains(arr2[i])) {
                    return false;
                }
            }
            return true;
        }
    }
}
