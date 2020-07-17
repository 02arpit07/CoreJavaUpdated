package Hashing;

import java.util.HashMap;

//Partition the string in two parts such that both parts have at least k different characters
//string =geeksforgeeks,k=4.......output=geeks forgeeks
public class HashMapDivideStrIn2PartswithKdistinctChar {
    public static void main(String[] args)
    {
        String str="geeksgeeks";
        int k=4;
        dividestring(str,k);
    }
    static void dividestring(String str,int k)
    {
        char[] arr=str.toCharArray();
        int n=arr.length;
        HashMap<Character,Boolean> hmap=new HashMap<>();
        int count=0,ans=0,i=0;
        while(i<n)
        {
            if(!hmap.containsKey(arr[i]))
            {
                hmap.put(arr[i],true);
                count++;
            }

            if(count==k)
            {
                ans=i;
                break;
            }
            i++;
        }
        count=0;
        hmap.clear();
        while(i<n)
        {
            if(!hmap.containsKey(arr[i]))
            {
                hmap.put(arr[i],true);
                count++;
            }
            if(count==k)
            {
                break;
            }
            i++;
        }
        if(count<k)
        {
            System.out.println("NOT POSSIBLE");
        }
        else{
            for(int j=0;j<=ans;j++)
            {
                System.out.print(arr[j]);
            }
            System.out.println();
            for(int j=ans+1;j<n;j++)
            {
                System.out.print(arr[j]);
            }
            System.out.println();
        }

    }

}
