package Strings.SortingAndSearching;
import java.util.*;
public class SortArrayOfStringsAccToLength {
    public static void main(String[] args)
    {
        String str="i love vashisht arpit";
        String[] strarr=str.split(" ");
        sort(strarr);
    }
    //used insertion sort to sort string acc to length of strings.
    static void sort(String[] strarr)
    {
        for(int i=1;i<strarr.length;i++)
        {
            String temp=strarr[i];
            int k=i-1;
            while(k>=0&&temp.length()<strarr[k].length())
            {
                strarr[k+1]=strarr[k];
                k--;
            }
            strarr[k+1]=temp;
        }

        for(String j:strarr)
        {
            System.out.print(j+" ");
        }
    }
}
