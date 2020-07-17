package Strings.ReverseAndRotation;
/*
You are given a string ‘str’, the task is to check that reverses of all
possible substrings of ‘str’ are present in ‘str’ or not.
 */
public class PerfectReversibleString {
    public static void main(String[] args)
    {
        String str="ababa";
        if(isReversible(str))
        {
            System.out.println("yes it is perfect reversible string");
        }
        else
        {
            System.out.println("no it is not perfect reversible string");

        }
    }
    static boolean isReversible(String str)
    {
        boolean flag=true;
        int i=0;
        int j=str.length()-1;
        while(i<j)
        {
            if(str.charAt(i)!=str.charAt(j))
            {
                flag=false;
                break;
            }
            i++;
            j--;
        }
        return flag;
    }
}
