package Strings.ReverseAndRotation;

public class CheckIfRotateByTwoBothWays {
    static int k=2;
    public static void main(String[] args)
    {
        String str1="amazon";
        String str2="onamza";
        boolean res=checkKarYar(str1,str2);
        System.out.println(res);
    }
    static boolean checkKarYar(String str1,String str2)
    {
        String first="";
        String second="";
        for(int i=0;i<str1.length();i++)
        {
            first=str1.substring(k,str1.length())+str1.substring(0,k);
        }
        for(int i=0;i<str1.length();i++)
        {
            second=str1.substring(str1.length()-k,str1.length())+str1.substring(0,str1.length()-k);
        }
        if(first.equals(str2)||second.equals(str2))
        {
            return true;
        }
        else{
            return false;
        }

    }
}
