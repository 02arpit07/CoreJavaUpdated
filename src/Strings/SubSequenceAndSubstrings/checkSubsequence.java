package Strings.SubSequenceAndSubstrings;
//check whether st1 is subsequence of str2.
//A subsequence could be formed by deleting elements but not interfaring with the sequence
public class checkSubsequence {
    public static void main(String[] args)
    {
        String str1="apivaht";
        String str2="arpit vashisht";
        int a=str1.length();
        int b= str2.length();
        boolean res=checkSubseq(str1,str2,a,b);
        System.out.println(res);

    }
    static boolean checkSubseq(String str1,String str2,int a,int b)
    {
        int j=0;
        for(int i=0;i<b&&j<a;i++)
        {
            if(str1.charAt(j)==str2.charAt(i))
            {
                j++;
            }
        }
        return(j==a);
    }
}
