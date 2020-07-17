package Strings.SortingAndSearching;
import java.util.*;
public class SortAlphabetsWithSumOfNumAtEnd {
    public static void main(String[] args )
    {//this considers all number seperately even when there are consecutive numbers
        String str="AR1P7JFK6";
        char[] arr=new char[26];
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isAlphabetic(str.charAt(i)))
            {
                arr[str.charAt(i)-'A']++;
            }
            else{
                sum=sum+str.charAt(i)-'0';
            }
        }
        String res="";
        for(int i=0;i<26;i++)
        {
            char ch=(char)('A'+i);

            while(arr[i]--!=0)
            {
                res=res+ch;
            }
        }
        if(sum>0)
        {
            res=res+sum;
        }
        System.out.println(res);
    }
}
