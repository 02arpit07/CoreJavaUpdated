package Arrays.SubArrays;
//differenece between this ques and longestSubarraywithmaxsum is that , this ques gives length of subarray
//but that ques specifically gives longest subarray
public class SizeOfSubarrayWithMaxSum {
    public static void main(String[] args)
    {
        int[] arr={ -2, -3, 4, -1, -2, 1, 5, -3};
        int len=arr.length;
        int res=getSize(arr,len);
        System.out.println(res);
    }
    static int getSize(int[] arr,int len)
    {
        int maxSofar=Integer.MIN_VALUE;
        int maxEndingHere=0;
        int start=0;
        int end=0;
        int s=0;
        for(int i=0;i<len;i++)
        {
            maxEndingHere=maxEndingHere+arr[i];
            if(maxEndingHere>maxSofar)// if i want longest size of subarray then apply = here.
            {
                maxSofar=maxEndingHere;
                start=s;
                end=i;
            }
            if(maxEndingHere<0)
            {
                maxEndingHere=0;
                s=i+1;
            }
        }
        return end-start+1;
    }
}
