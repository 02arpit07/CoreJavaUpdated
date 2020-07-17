package Strings.ReverseAndRotation;

import java.util.Stack;

public class ReverseOnlyVowels {
    public static void main(String[] args)
    {
        String str="arpit is my name";
        Stack<Character> vowels=new Stack<>();
        char[] arr=new char[str.length()];
        for(int i=0;i<str.length();i++)
        {
            if(isVowel(str.charAt(i)))
            {
                vowels.push(str.charAt(i));
            }
            else{
                arr[i]=str.charAt(i);
            }
        }
        for(int i=0;i<str.length();i++)
        {
           if(arr[i]==0)
           {
               arr[i]=vowels.pop();
           }
        }
        System.out.println(String.valueOf(arr));

    }
    static boolean isVowel(char ch)
    {
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
        {
            return true;
        }
        return false;
    }
}
