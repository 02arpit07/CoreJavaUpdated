package Strings.StringBasics;

public class PangramChecking {
    public static void main(String[] args)
    {
        String str1="The quick brown fox jummmmmmmps over the laZy dog              ";
        boolean[] flag=new boolean[26];
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
            if(flag[i]==true)
            {
                continue;
            }
            else{
                System.out.println("Not a pangram");
                mark=0;
                break;
            }
        }
        if(mark!=0) {
            System.out.println("Yes it is pangram");
        }
    }
}
