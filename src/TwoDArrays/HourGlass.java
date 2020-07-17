package TwoDArrays;

public class HourGlass {
    public static void main(String[] args)
    {
        int n =7;
        printHourGlass(n);
    }
    static void printHourGlass(int n)
    {
        int i,j,k;
        for(i=1;i<=n;i++)
        {
            for(k=1;k<i;k++)
            {
                System.out.print(" ");
            }
            for(j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(i=n-1;i>=1;i--)
        {
            for(k=1;k<i;k++)
            {
                System.out.print(" ");
            }
            for(j=i;j<=n;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
