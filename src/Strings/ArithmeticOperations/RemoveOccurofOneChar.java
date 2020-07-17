package Strings.ArithmeticOperations;
//Problem name-Minimize the length of string by removing occurrence of only one character
//testcase
// Input: str = "abccderccwq"
//Output: 7
//character 'c' will be deleted since it has maximum occurrence.
//
//Input: str = "dddded"
//Output: 1
//character 'd' will be deleted
import java.util.Scanner;

public class RemoveOccurofOneChar {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str="afddewqd";
        int res=removeOcc(str);
        System.out.println(res);
    }
    static int removeOcc(String str)
    {
        int[] freq=new int[26];
        for(int i=0;i<str.length();i++)
        {
            freq[str.charAt(i)-'a']++;
        }
        int max=0;
        for(int i=0;i<freq.length;i++)
        {

            if(max<freq[i])
            {
                max=freq[i];
            }
        }
        return str.length()-max;
    }
}
