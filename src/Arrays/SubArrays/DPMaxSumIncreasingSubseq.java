package Arrays.SubArrays;

public class DPMaxSumIncreasingSubseq {
    //DP IS USED. TIME COMPLEXITY OD O(n^2)
    public static void main(String[] args)
    {
        int[] arr={1, 101, 2, 3, 100, 4, 5};
        int len=arr.length;
        int result=findAns(arr,len);
        System.out.println(result);
    }
    static int findAns(int[] arr,int len)
    {
        int max=0;
        int[] secarr=new int[len];
        for(int i=0;i<len;i++)
        {
            secarr[i]=arr[i];
        }
        for(int i=1;i<len;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[j]<arr[i] && secarr[i]<secarr[j]+arr[i])
                {
                    secarr[i]=secarr[j]+arr[i];
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            if(max<secarr[i])
            {
                max=secarr[i];
            }
        }
        return max;
    }
}
