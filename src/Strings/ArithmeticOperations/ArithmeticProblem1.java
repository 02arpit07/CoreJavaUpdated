package Strings.ArithmeticOperations;

import java.util.Scanner;

//Find the smallest number such that the sum of its digits is N and it is divisible by 10^N.
public class ArithmeticProblem1 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        findNumber(n);
    }
    static void findNumber(int n )
    {
        if(n==0)
        {
            System.out.print(0);
        }
        if(n%9!=0)
        {
            System.out.print(n%9);
        }
        for(int i=1;i<=(n/9);i++)
        {
            System.out.print(9);
        }
        for(int i=1;i<=n;i++)
        {
            System.out.print(0);
        }
    }
}
