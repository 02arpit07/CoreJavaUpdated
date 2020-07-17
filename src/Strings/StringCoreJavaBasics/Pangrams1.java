package Strings.StringCoreJavaBasics;

public class Pangrams1 {
    public static void main(String[] args)
    {
        String str1="the Quick brown fox jumps over the lazy dog";
       pangram(str1); }
    public static void pangram(String str1)
    {
        boolean[] mark=new boolean[26];
        int index=0;
        int count =0;
        char[] str2=new char[str1.length()];
        char[] str3=str1.toCharArray();
        for(int i=0;i<str1.length();i++)
        {
            if(str1.charAt(i)>='A'&&str1.charAt(i)<='Z')
            {
                index=str1.charAt(i)-'A';
                count++;
            }
            else if(str1.charAt(i)>='a'&&str1.charAt(i)<='z')
            {
                index=str1.charAt(i)-'a';
                count++;
            }
            mark[index]=true;

        }
        for(int i=0;i<=25-count;i++) {
            if (mark[i] == false) {
                str2[i] = str3[i];
            }
        }
        System.out.println(str2.toString());
    }
}
