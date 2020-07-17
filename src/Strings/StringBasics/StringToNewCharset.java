package Strings.StringBasics;
//egrt-code   utta-geek
public class StringToNewCharset {
    public static void main(String [] args)
    {
        String str="qwertyuiopasdfghjklzxcvbnm";
        String given="egrt";
        String result="";
        for(int i=0;i<given.length();i++)
        {
            int a=str.indexOf(given.charAt(i));
            char b=(char)(a+'a');
            result=result+b;
        }
        System.out.println(result);
    }
}
