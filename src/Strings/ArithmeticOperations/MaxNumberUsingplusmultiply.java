package Strings.ArithmeticOperations;

public class MaxNumberUsingplusmultiply {
    public static void main(String[] args)
    {
        String str1="01231";
        int result=0;
        for(int i=0;i<str1.length();i++)
        {
            int ch=str1.charAt(i)-'0';
            if(ch==0||ch==1)
            {
              result=result+ch;
            }
            else{
                if(result==0||result==1)
                {
                    result=result+ch;
                }
                else{
                    result=result*ch;
                }
            }
        }
        System.out.println(result);

    }
}
