package FinalRevision;

import java.util.Scanner;

public class KadaneAlgo5 {
    public static void main (String[] args) {
        //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            int n =sc.nextInt();
            int[] arr=new int[n];
            int sum=0,maxsum=0;
            for(int i=0;i<arr.length;i++)
            {
                sum=sum+arr[i];
                if(sum>maxsum)
                {
                    maxsum=sum;
                }
                else if(sum<0)
                {
                    sum=0;
                }
                else{
                    continue;
                }
            }
            System.out.println(maxsum);
        }

    }
}
