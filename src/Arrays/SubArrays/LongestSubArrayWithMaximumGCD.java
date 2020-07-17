package Arrays.SubArrays;
//GCD-GREATEST COMMON DIVISOR ALSO KNOWN AS HCF
// we have these elem in array 1234 oytput will be 1, 3333 will have output 4,1233344 will have output 2
public class LongestSubArrayWithMaximumGCD {
    public static void main(String[] args)
    {
        int[] arr={1,3,3,1,2,3,2,2,2,4,3,3,2,4,5};
        int len=arr.length;
        System.out.println(getLength(arr,len));
    }
    static int getLength(int[] arr,int len)
    {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<len;i++)
        {
            max=Math.max(max,arr[i]);
        }
        int ans=0;
        for(int i=0;i<len;i++)
        {
            if(arr[i]!=max)
            {
                continue;
            }
            //two pointerr sol
            int j =i;
            while(arr[j]==max)
            {
                j++;
                if(j>=len)
                {
                    break;
                }
            }
            ans=Math.max(ans,j-i);

        }
        return ans;
    }
}
