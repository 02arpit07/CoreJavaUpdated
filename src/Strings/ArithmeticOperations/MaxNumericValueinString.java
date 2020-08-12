package Strings.ArithmeticOperations;

public class MaxNumericValueinString {
    public static void main(String[] args)
    {
        String str = "100klh564abc365bg5666";

        System.out.println(extractMaximum(str));

    }
    static int extractMaximum(String str)
    {
        String temp="";
        int currNum=0;
        int maxNum=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                temp=temp+str.charAt(i);
            }
            else{
                if(Integer.parseInt(temp)>maxNum)
                {
                    maxNum=Integer.parseInt(temp);
                }
                temp="0";
            }
        }
        return Math.max(maxNum,Integer.parseInt(temp));

    }
}
