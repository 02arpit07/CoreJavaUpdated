package Strings.CaseSensitiveString;

public class PrintViceVersaCases {
    public static void main(String[] args)
    {
        String str="ArPit VaSHishT";
        String result="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch))
            {
                result=result+(char)(ch+32);
            }
            else{
                result=result+(char)(ch-32);
            }
        }
        System.out.println(result);
    }
}
