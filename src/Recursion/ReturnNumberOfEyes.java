package Recursion;

public class ReturnNumberOfEyes {
    public static void main(String[] args)
    {
        int  cats=10;
        int result=CatEyes(cats);
        System.out.print("Totals eyes "+result);

    }
    static int CatEyes(int cats)
    {
        if(cats==0)
        {
            return 0;
        }
        else{
            return 2+CatEyes(cats-1);
        }
    }
}
