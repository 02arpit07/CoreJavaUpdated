package Strings.ArithmeticOperations;

public class AddOnlyNumbersinString {
    public static void main(String[] args)
    {
        String str="12abc20y1z68";
        System.out.println(findSum(str));
    }
    static int  findSum(String str)
    {
        int sum=0;
        String s="";
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
            {
                s=s+ch;
            }
            else{
                sum=sum+Integer.parseInt(s);
                s="0";
            }
        }
        return sum+Integer.parseInt(s);
    }
}
