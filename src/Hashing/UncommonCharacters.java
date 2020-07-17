package Hashing;

import java.util.ArrayList;
import java.util.HashMap;

public class UncommonCharacters {
    public static void main(String[] args)
    {
        String str="characters";
        String str1="alphabets";
        int[] arr=new int[26];

        for(int i=0;i<str.length();i++)
        {
            arr[str.charAt(i)-'a']=1;
        }
        for(int i=0;i<str1.length();i++)
        {
            if(arr[str1.charAt(i)-'a']==1||arr[str1.charAt(i)-'a']==-1)
            {
                arr[str1.charAt(i)-'a']=-1;
            }
            else{
                arr[str1.charAt(i)-'a']=2;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(arr[i]==1||arr[i]==2)
            {
                System.out.print((char)(i+'a')+" ");
            }
        }
    }
}
