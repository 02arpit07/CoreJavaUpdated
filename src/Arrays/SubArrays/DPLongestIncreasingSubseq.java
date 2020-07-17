package Arrays.SubArrays;

public class DPLongestIncreasingSubseq {
    public static void main(String[] args)
    {
        int[] arr={10, 22, 9, 33, 21, 50, 41, 60 };
        int len=arr.length;
        int answer=getAnswer(arr,len);
        System.out.println(answer);
    }
    static int getAnswer(int[] arr,int len)
    {
        int sum=0;
        int[] arr2=new int[len];
        for(int i=0;i<len;i++)
        {
            arr2[i]=1;
        }
        for(int i=1;i<len;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(arr[i]>arr[j] && arr2[i]<arr2[j]+1)//https://www.geeksforgeeks.org/maximum-sum-increasing-subsequence-dp-14/ watch video if forgotten
                {
                    arr2[i]=arr2[j]+1;
                }
            }
        }
        for(int i=0;i<len;i++)
        {
            if(sum<arr2[i])
            {
                sum=arr2[i];
            }
        }
        return sum;
    }
}
