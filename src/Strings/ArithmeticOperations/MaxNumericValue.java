package Strings.ArithmeticOperations;

import java.util.ArrayList;

//Extract maximum numeric value from a given string
//Testcases
//Input : 100klh564abc365bg
//Output : 564
//Maximum numeric value among 100, 564
//and 365 is 564.
//Input : abchsd0365sdhs
//Output : 365
public class MaxNumericValue {
    public static void main(String[] args)
    {
        String str="100klh564abc365bg4";
        getvalue(str);
    }
    static void getvalue(String str)
    {
        int sum=0;
        String s="";
        int flag=0;
        ArrayList<Integer> al=new ArrayList<>();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(Character.isDigit(ch))
            {
                s=s+ch;
                flag=1;
            }
            else if(s.equals("0"))
            {
                continue;
            }
            else{
                int a=Integer.parseInt(s);
                al.add(a);
                s="0";
                flag=0;

            }
        }
        if(flag==1) {
            al.add(Integer.parseInt(s));
        }
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;
        for(int i:al)
        {
            if(max<i)
            {
                max=i;
            }
            if(min>i)
            {
                min=i;
            }
        }
        System.out.println("Maximum is :"+max);
        System.out.println("Minimum is :"+min);
    }

}
