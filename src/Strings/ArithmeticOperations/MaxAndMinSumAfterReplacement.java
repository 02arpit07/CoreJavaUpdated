package Strings.ArithmeticOperations;

public class MaxAndMinSumAfterReplacement {
    public static void main(String[] args)
    {
        int a=56;
        int b=65;
        getMaxAndMin(a,b);
    }
    static void getMaxAndMin(int num1,int num2)
    {
        int max=replace(num1,5,6)+replace(num2,5,6);
        int min=replace(num1,6,5)+replace(num2,6,5);
        System.out.println(max);
        System.out.println(min);
    }
    static int replace(int x,int a,int b)
    {
        int result=0;
        int multiply=1;
        while(x%10>0)
        {
            int remainder=x%10;
            if(remainder==a)
            {
                result=result+b*multiply;
            }
            else{
                result=result+remainder*multiply;
            }
            multiply=multiply*10;
            x=x/10;
        }
        return result;
    }
}
