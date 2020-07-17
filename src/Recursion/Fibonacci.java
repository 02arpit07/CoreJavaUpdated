package Recursion;

public class Fibonacci {
    public static void main(String[] args)
    {
        //get the element at 10 pos of fibonacci series using recursion
        int n=6;
        System.out.print(getFibonacci(n));
    }
    static int getFibonacci(int num)
    {
        if(num==0)
        {
            return 0;
        }
        if(num==1||num==2)
        {
            return 1;
        }
        else{
            return getFibonacci(num-1)+getFibonacci(num-2);
        }
    }
}
