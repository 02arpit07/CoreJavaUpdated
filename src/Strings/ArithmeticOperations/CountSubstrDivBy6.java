package Strings.ArithmeticOperations;

public class CountSubstrDivBy6 {
    public static void main(String[] args)
    {
        String str="4806";
        int count=0;
        for(int i=0;i<str.length();i++)
        {
            for(int j=i+1;j<=str.length();j++)
            {
                int a=Integer.parseInt(str.substring(i,j));
                if(a%6==0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
