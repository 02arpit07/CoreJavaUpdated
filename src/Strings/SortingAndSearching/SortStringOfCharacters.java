package Strings.SortingAndSearching;

import java.util.Arrays;

public class SortStringOfCharacters {
    public static void main(String[] arss)
    {
        String s = "geeksforgeeks";
        sortString(s);
    }
    static void sortString(String s)
    {
        char[] arr=s.toCharArray();
        Arrays.sort(arr);
        System.out.print(String.valueOf(arr));
    }
}
