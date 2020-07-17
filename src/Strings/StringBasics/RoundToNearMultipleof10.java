package Strings.StringBasics;

public class RoundToNearMultipleof10 {
    public static void main(String[] args)
    {
        int n=1005;
        int unit=n%10;
        if(10-unit>5)
        {
            n=n-unit;
        }
        else{
            n=n+(10-unit);
        }
        System.out.println(n);
    }
}
