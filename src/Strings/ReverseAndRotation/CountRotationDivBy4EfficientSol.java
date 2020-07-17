package Strings.ReverseAndRotation;
/*
Consider a number 928160
check all pairs possible in all rotation at end two pos
92 28 81 60 09. Now we need to check how many of these pair number are div by 4 . That is the ans to ur problem
 */
public class CountRotationDivBy4EfficientSol {
    public static void main (String[] args)
    {
        String num="928160";
        int a=gettheOutput(num);
        System.out.println(a);
    }
    static int gettheOutput(String str)
    {
        int len=str.length();
        if(len==1)
        {
            int onedig=str.charAt(0)-'0';
            if(onedig%4==0)
            {
                return 1;
            }
            return 0;
        }
        int count=0,twoDigit;
        for(int i=0;i<len-1;i++)
        {
            twoDigit=(str.charAt(i)-'0')*10+(str.charAt(i+1)-'0');
            if(twoDigit%4==0)
            {
                count++;
            }
        }
        twoDigit=(str.charAt(len-1)-'0')*10+(str.charAt(0)-'0');
        if(twoDigit%4==0)
        {
            count++;
        }
        return count;
    }
}
