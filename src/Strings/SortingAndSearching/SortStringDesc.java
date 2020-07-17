package Strings.SortingAndSearching;

import java.util.Arrays;

public class SortStringDesc {
    public static void main(String[] args)
    {
        String str1="arpit vashisht";
        String str="";
        char[] arr=str1.toCharArray();
        Arrays.sort(arr);
        String result=reverse(arr);
        System.out.println(result);
    }
    public static String reverse(char[] arr)
    {
        String result="";
        for(int i=arr.length-1;i>=0;i--)
        {
            result=result+arr[i];
        }
        return  result;
    }
}
