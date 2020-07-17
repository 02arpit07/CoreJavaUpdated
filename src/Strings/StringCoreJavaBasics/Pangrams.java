package Strings.StringCoreJavaBasics;

public class Pangrams {
    public static void main(String[] args)
    {
        String str1="the Quick brown foX jjjjjjjjjjjjjjumps over the lazy dog";
        if(pangram(str1)==true)
        {
            System.out.println("yes it is pangram");
        }
        else{
            System.out.println("not a pangram");
        }
    }
    public static boolean pangram(String str1)
    {
        boolean[] mark=new boolean[26];
        int index=0;
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)>='A'&&str1.charAt(i)<='Z')
            {
                index=str1.charAt(i)-'A';
            }
            else if(str1.charAt(i)>='a'&&str1.charAt(i)<='z')
            {
                index=str1.charAt(i)-'a';
            }
            mark[index]=true;
        }
        for(int i=0;i<=25;i++)
            if(mark[i]==false)
                return false;

                return  true;

    }
}
