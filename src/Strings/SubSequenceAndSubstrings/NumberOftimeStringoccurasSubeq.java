package Strings.SubSequenceAndSubstrings;
//PROBLEM NAME-----Find number of times a string occurs as a subsequence in given string
/*  Input:
string a = "GeeksforGeeks"
string b = "Gks"

Output: 4
*/
//This problem could be solved either by iteative approach or dp.
public class NumberOftimeStringoccurasSubeq {
    public static void main(String[] args)
    {
        String a="GeeksforGeeks";
        String b="Gks";
        System.out.println(getAns(a,b,a.length(),b.length()));
    }
    static int getAns(String a,String b,int m ,int n)
    {
        if(n==0||m==0&&n==0)
        {
            return 1;
        }
        if(m==0)
        {
            return 0;
        }

        if(a.charAt(m-1)==b.charAt(n-1))
        {
            return getAns(a,b,m-1,n-1)+getAns(a,b,m-1,n);
        }
        else{
            return getAns(a,b,m-1,n);
        }
    }

}
