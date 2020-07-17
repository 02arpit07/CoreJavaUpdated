package DP.KnapsackProblems;

public class SubsetSumProblem {
    //Output will be in form of true or false

    //Make a global matrix.
    static boolean[][] t=new boolean[6][12];

    public static void main(String[] args)
    {
        int[] arr={2,3,7,8,10};
        int sum=11;
        int n=arr.length;
        //Now tell is there any set of elements which can make sum as 11.
        System.out.print(SubsetSum(arr,sum,n));

    }
    static boolean SubsetSum(int[] arr,int sum,int n)
    {
        for(int i=0;i<n+1;i++)
        {
            for(int j=0;j<sum+1;j++)
            {
                if(i==0)
                {
                    t[i][j]=false;
                }
                if(j==0)
                {
                    t[i][j]=true;
                }
            }
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<sum+1;j++)
            {
                if(arr[i-1]<=j)
                {
                    t[i][j]=t[i-1][j-arr[i-1]]||t[i-1][j];
                }
                else{
                    t[i][j]=t[i-1][j];
                }
            }
        }
        return t[n][sum];
    }
}
