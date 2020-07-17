package Strings.StringBasics;
import java.util.*;
public class PangramMissing {
    public static void main(String[] args)
    {
        String str1="asdgf";
        boolean[] flag=new boolean[26];
       HashSet<Character> hs=new HashSet<>();
        str1=str1.toLowerCase();
        int mark=1;
        for(int i=0;i<str1.length();i++)
        {
            if(Character.isAlphabetic(str1.charAt(i)))
            {
                int ch=((int)str1.charAt(i))-'a';
                flag[ch]=true;
            }
        }
        for(int i=0;i<26;i++)
        {
            if(flag[i]==false)
            {
                //missing.append((char)((int)(str1.charAt((i)))+'a'));
                hs.add((char)(i+'a'));
                mark=0;
            }
            else{
                continue;
            }
        }
        if(mark!=0) {
            System.out.println("Yes it is pangram");
        }
        else{
            Iterator<Character> itr=hs.iterator();
            while(itr.hasNext())
            {
                System.out.print(itr.next());
            }
        }
    }
}
