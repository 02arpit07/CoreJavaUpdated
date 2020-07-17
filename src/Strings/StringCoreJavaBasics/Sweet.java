package StringCoreJavaBasics;

import java.util.Arrays;
import java.util.Scanner;

public class Sweet {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();

        int n =sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int[] arraynew=new int[n];
        Arrays.fill(arraynew,0, n-1,1);
        for(int i=0;i<n-1;i++)
        {
            if(arr[i+1]==arr[i])
            {
                arraynew[i+1]=arraynew[i];
            }
            else if(arr[i+1]>arr[i])
            {
                arraynew[i+1]=arraynew[i]+1;
            }
            else if(arr[i+1]<arr[i]){
                arraynew[i+1]=1;
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arraynew[i];
        }
        System.out.println(sum);
    }
}
