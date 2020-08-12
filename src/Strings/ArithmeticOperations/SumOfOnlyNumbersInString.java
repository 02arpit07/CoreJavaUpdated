package Strings.ArithmeticOperations;

public class SumOfOnlyNumbersInString {
    public static void main(String[] args)
    {
        String str = "12abc20yz68";

        System.out.println(findSum(str));
    }
    static int findSum(String str)
    {
        String temp="";
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                temp=temp+str.charAt(i);
            }
            else{
                sum=sum+Integer.parseInt(temp);
                temp="0";
            }
        }
        return sum+Integer.parseInt(temp);
    }
}
