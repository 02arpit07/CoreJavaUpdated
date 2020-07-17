package Strings.StringBasics;

import java.util.HashSet;

//gggg=true jdjdhd=false.
public class CheckallcharAreSame {
    public static void main(String[] args)
    {
        String str="gggg";
        HashSet<Character> hs=new HashSet<>();
        for(int i=0;i<str.length();i++)
        {
            hs.add(str.charAt(i));
        }
        if(hs.size()==1)
        {
            System.out.println("TRUE YES IT HAS ALL SAME CHARACTER");
        }
        else{
            System.out.println(" False No it does not have all same");
        }


    }
}
