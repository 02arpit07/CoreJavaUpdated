package Strings.ArithmeticOperations;

public class SumOfTwoLargeNumber {
    //parseLong method is applicable on numbers upto 20 digit not more than that
    public static void main(String[] args)
    {
        String str1 = "3333311111111111";
        String str2 =   "44422222221111";
        System.out.println(Add(str1,str2));
    }
    static long Add(String str1,String str2)
    {
        long sum=0;
        sum=sum+Long.parseLong(str1)+Long.parseLong(str2);
        return sum;
    }
}
