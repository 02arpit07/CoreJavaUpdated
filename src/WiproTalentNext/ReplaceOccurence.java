package WiproTalentNext;
import java.util.*;
public class ReplaceOccurence {
    public static  void main(String[] args)
    {
        String str="asdgsagsfgsjkahdbsajjdda";
        String[] str1=str.split("");
        int count=0;
        String replace="?";
        int x=0;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a')
            {
                str1[i]=replace;
                replace=replace+"?";
                x++;
            }
        }
        for(int i=0;i<str1.length;i++)
        {
            System.out.print(str1[i]);
        }

    }
}
