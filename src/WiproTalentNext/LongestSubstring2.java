package WiproTalentNext;
import java.util.*;
//Kohli
public class LongestSubstring2 {
    public static void main(String []args){
        //Scanner s1=new Scanner (System.in);
        String str="ssssassssssa";
        char ch[]=str.toCharArray();
        String str1[]=new String[20];
        for(int i=0;i<str1.length;i++)
        {
            str1[i]="";
        }
        int c=0;
        for(int i=0;i<ch.length;i++)
        {
            if(ch[i]=='s')
            {
                for(int j=i;j<ch.length;j++)
                {
                    if(ch[j]!='a')
                    {
                        str1[c]=str1[c]+ch[j];

                    }
                    if(ch[j]=='a')
                    {
                        c++;
                    }

                }


            }

        }

        Arrays.sort(str1,Collections.reverseOrder());
        System.out.println(str1[0]+'a');

    }
}
