package Strings.CaseSensitiveString;

public class findUpperCaseAlphabets {
    public static void main(String[] args)
    {
        String str="Arpit Vashisht";
        String result="";
        for(int i=0;i<str.length();i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                result=result+str.charAt(i);

            }
        }
        System.out.println(result);
    }
}
