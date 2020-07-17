package PracticeLinks.PracticeLink2;
//1
import java.util.Arrays;
import java.util.Scanner;

public class MinDistBetween2elemQ1 {
    public static void main(String[] atr)
    {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        while(n--!=0)
        {
            int m =sc.nextInt();
            int[] arr=new int[m];
            for(int i=0;i<m;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int ans=Integer.MAX_VALUE;
            for(int i=0;i<m;i++)
            {
                for(int j=i+1;j<m;j++)
                {
                    int res=Math.abs(arr[i]-arr[j]);
                    if(ans>res)
                    {
                        ans=res;
                    }
                }
            }
            System.out.println(ans);
        }
    }
}
