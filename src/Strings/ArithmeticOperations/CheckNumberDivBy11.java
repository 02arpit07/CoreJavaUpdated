package Strings.ArithmeticOperations;

public class CheckNumberDivBy11 {
    public static void main(String[] args)
    {
        String num="1234567589333892";
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
        int evensum=0,oddsum=0;
        for(int i=0;i<num.length();i++)
        {
            if(i%2==0)
            {
                oddsum=oddsum+(num.charAt(i)-'0');
            }
            else{
                evensum=evensum+num.charAt(i)-'0';
            }
        }
        if((evensum-oddsum)%11==0)
        {
            return true;
        }
        return false;
    }
}
