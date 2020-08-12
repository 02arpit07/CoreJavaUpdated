package WiproTalentNext;

import java.util.Scanner;

public class LongestSubstring_a__s {


    public static void main(String args[])
    {
        String str="sasafghjkghhkskkjihnnojoa";
        getLongestSubstr(str);
    }
    static  void getLongestSubstr(String str) {
        boolean flag=true;
        int start=0;
        int end=0;
        int count=0;
        int maxlen=0;
        if(flag)
        {
            for (int i=0;i<str.length();i++)
            {
                if(str.charAt(i)=='s')
                {
                    start=i;
                     while (str.charAt(i)!='a')
                     {
                         count++;
                         i++;
                     }
                     if(maxlen<count)
                     {
                         maxlen=count;
                         end=i;
                     }
                }
            }
        }
        String result="";
        for(int i=start;i<=end;i++)
        {
            result=result+str.charAt(i);
        }
        System.out.print(result);
    }

}

