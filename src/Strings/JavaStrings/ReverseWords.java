package Strings.JavaStrings;

import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str="Welcome to Geeksforgeeks";
        String[] str1=str.split(" ");
        for(int i=str1.length-1;i>=0;i--)
        {
            System.out.print(str1[i]+" ");
        }
    }
}
