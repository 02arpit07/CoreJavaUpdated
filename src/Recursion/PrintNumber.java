package Recursion;

public class PrintNumber {
    public static void main(String[] args)
    {
        int num=5;
        PrintNumberrr(num);
    }
    static void PrintNumberrr(int num)
    {
        if(num==0)
        {
            return;
        }
        else{
            System.out.println(num);
            PrintNumberrr(num-1);
        }
    }
}
