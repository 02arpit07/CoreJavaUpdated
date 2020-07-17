package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class HashMapAnagramQues {
    public static void main(String[] args)
    {
        String str="Arpitz";
        String str2="tiprAz";
        char[] arr1=str.toCharArray();
        char[] arr2=str2.toCharArray();
        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        for(int i=0;i<arr1.length;i++)
        {
            if(hm1.get(arr1[i])==null)
            {
                hm1.put(arr1[i],1);
            }
            else{
                Integer c=(int)hm1.get(arr1[i]);
                hm1.put(arr1[i],c+1);
            }
        }
        for(int i=0;i<arr2.length;i++)
        {
            if(hm2.get(arr2[i])==null)
            {
                hm2.put(arr2[i],1);
            }
            else{
                Integer c=(int)hm2.get(arr2[i]);
                hm2.put(arr2[i],c+1);
            }
        }
        if(hm1.equals(hm2))
        {
            System.out.println("Yes it is anagram");
        }
        else{
            System.out.println("No it is not");
        }

    }
}
