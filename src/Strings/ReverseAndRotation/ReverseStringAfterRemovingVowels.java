package Strings.ReverseAndRotation;
//Done full code by myself in one go.
public class ReverseStringAfterRemovingVowels {
    public static void main(String[] args)
    {
        String str="geeksforgeeks";
        System.out.println(RevandRemoveVow(str));
    }
    static String RevandRemoveVow(String str)
    {
        int[] flag=new int[str.length()];
        for(int i=0;i<str.length();i++)
        {
            if(isVowel(str.charAt(i)))
            {
                flag[i]=1;
            }
        }
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        String str1=sb.toString();
        String result="";
        for(int i=0;i<str1.length();i++)
        {
            if(flag[i]==1)
            {
                continue;
            }
            result=result+str1.charAt(i);
        }
        return result;
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
/*
Given a string s, print reverse of string and remove the characters from the reversed string where there are vowels in the original string.

Input : geeksforgeeks
Output : segrfseg
Explanation :
Reversed string is skeegrofskeeg, removing characters
from indexes 1, 2, 6, 9 & 10 (0 based indexing),
we get segrfseg .
 */
