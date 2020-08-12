package Strings.SubSequenceAndSubstrings;

public class NumberOfSubseqASabINString {
    public static void main(String[] args)
    {
        String S = "abcb";
        int k = 2;

        System.out.println(countOccurrences(S, k));
    }
    static int countOccurrences(String str, int k)
    {
        int result=0;
        String str1="";
        for(int i=0;i<k;i++)
        {
            str1=str1+str;
        }
        for(int i=0;i<str1.length();i++)
        {
            int x=0;
            if(str1.charAt(i)=='a')
            {
                x=getTotalBafterthisA(i,str1);
            }
            result=result+x;
        }
        return result;
    }
    static int getTotalBafterthisA(int i,String str)
    {
        int count=0;
        for (int j=i;j<str.length();j++)
        {
            if(str.charAt(j)=='b')
            {
                count++;
            }
        }
        return count;
    }
}
