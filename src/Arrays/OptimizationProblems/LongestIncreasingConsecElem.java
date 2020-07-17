package Arrays.OptimizationProblems;

public class LongestIncreasingConsecElem {
    //to check longest series of elements adjacent to each other.
    public static void main(String[]  args)
    {
        //int[] arr={3,4,5,0,6,2,3};
        int[] arr={6,5,4,3,1,2};
        int count=1;
        int maxLengthTillNow=Integer.MIN_VALUE;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]<arr[i+1])
            {
                count++;
            }
            if(arr[i]>arr[i+1])
            {
                count=0;
            }
            if(maxLengthTillNow<count)
            {
                maxLengthTillNow=count;
            }
        }
        System.out.print(maxLengthTillNow);
    }
}
