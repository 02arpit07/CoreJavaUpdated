package Strings.ReverseAndRotation;

public class CheckIfStringAreRotationOfEachOther {
    public static void main(String[] args)
    {
        String str1="arpit";
        String str2="tarp";
        boolean result=checkKaro(str1,str2);
        if(result)
        {
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        }
    }
    static boolean checkKaro(String str1,String str2)
    {
        StringBuffer sb=new StringBuffer(str1);
        sb.append(str1);
        String result="";
        boolean a=false;
        for(int i=0;i<str1.length();i++)
        {
            result="";
            for(int j=0;j!=str1.length();j++)
            {
                result=result+sb.charAt(i+j);
            }
           if(str2.equals(result))
           {
                  a=true;
           }
        }
        return a;

    }
}
