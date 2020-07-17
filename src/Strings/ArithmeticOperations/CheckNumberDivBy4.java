package Strings.ArithmeticOperations;

public class CheckNumberDivBy4 {
    public static void main(String[] args)
    {
        String num="363588395960667043875487";
        if(check(num))
        {
            System.out.println("yes");
        }
        else{
            System.out.println("NO");
        }
    }
    static boolean check(String num)
    {
        int len =num.length();
        if(len==0)
        {
            return  false;
        }
        if(len==1)
        {
            return (num.charAt(0)-'0')%4==0;
        }
        String temp="";
        temp=temp+num.charAt(len-2);
        temp=temp+num.charAt(len-1);
        int a=Integer.parseInt(temp);
        if(a%4==0)
        {
            return true;
        }
        else {
            return false;
        }
    }
}
