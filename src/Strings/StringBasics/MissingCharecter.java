package Strings.StringBasics;

import java.util.ArrayList;

public class MissingCharecter {
    public static void main(String[] args)
    {
        String a="abcd";
        String b = "cbdae";
        ArrayList<Character> al=new ArrayList<>();
        for(int i=0;i<a.length();i++)
        {
            al.add(a.charAt(i));
        }
        for(int i=0;i<b.length();i++)
        {
            if(al.contains(b.charAt(i)))
            {
                continue;
            }
            else{
                System.out.println(b.charAt(i));
            }
        }

    }
}
