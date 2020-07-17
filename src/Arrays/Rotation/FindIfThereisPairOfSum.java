package Arrays.Rotation;

public class FindIfThereisPairOfSum {
    public static void main(String[] args)
    {
        int arr[] = {11, 15, 6, 8, 9, 10};
        int sum = 15;
        int n = arr.length;

        if (pairInSortedRotated(arr, n, sum))
            System.out.print("Array has two elements" +
                    " with sum 16");
        else
            System.out.print("Array doesn't have two" +
                    " elements with sum 16 ");
    }
    public static boolean pairInSortedRotated(int[] arr,int n,int sum)
    {
        int i;
        for(i=0;i<n-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                break;
            }
        }
        int last=i;//index of largest element
        int first=(i+1)%n;//insex of smallest element

        while(first!=last)
        {
            if(arr[first]+arr[last]==sum)
            {
                return true;
            }
            else if(arr[first]+arr[last]>sum)
            {
                last=(last+1)%n;
            }
            else{
                first=(first+n-1)%n;
            }
        }
        return false;

    }
}
