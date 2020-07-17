package Recursion;

public class Factorial {
    public  static void main(String[] args)
    {
        int fact=5;
        int x=getFact(fact);
        System.out.print(x);
    }
    static int getFact(int num)
    {
        if(num==1)
        {
            return 1;
        }
        return num*getFact(num-1);
    }
}
