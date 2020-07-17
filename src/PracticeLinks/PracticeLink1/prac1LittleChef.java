package PracticeLinks.PracticeLink1;

import java.util.Arrays;
import java.util.Scanner;

public class prac1LittleChef {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //sc.nextInt();
        while(n--!=0)
        {
            int a=sc.nextInt();
            int[] arr=new int[a];
            for(int i=0;i<a;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int b=arr[a-1];
            int sum=0;
            for(int i=0;i<a;i++)
            {
                int c=b-arr[i];
                sum=sum+c;
            }
            System.out.println(sum);
        }
    }

}
