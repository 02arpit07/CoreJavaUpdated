package Strings.StringBasics;
//A Duck number is a number which has zeroes present in it, but there should be no zero present in the
// beginning of the number. For example 3210, 8050896, 70709 are all duck numbers whereas 02364,
// 03401 are not.
public class DuckNumber {
    public static void main(String[] args)
    {
        String str="111111111011111";
        String temp="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(0)=='0')
            {
                temp=temp+i;
            }
        }
        if(str.contains("0"))
        {
            if(temp.contains("0"))
            {
                System.out.println("Not a duck Number");
            }
            else {
                System.out.println("Duck Number");
            }
        }
        else{
            System.out.println("Not a duck number");
        }
    }
}
