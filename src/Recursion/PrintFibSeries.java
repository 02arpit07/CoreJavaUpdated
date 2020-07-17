package Recursion;

public class PrintFibSeries {
    public static void main(String[] args)
    {
        System.out.print(a+ " "+ b+" ");
        getFib(10);
    }
   static int a=0,b=1,c;
    static void getFib(int num)
    {
        if(num==1||num==2)
        {
            return;
        }
        c=a+b;
        System.out.print(c+" ");
        a=b;
        b=c;
        getFib(num-1);

    }
}
