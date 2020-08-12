package FinalRevision;

// If a subarray has sum greater than the given sum then there is no possibility
// that adding elements to the current subarray the sum will be x (given sum).
// Idea is to use a similar approach to a sliding window. Start with an empty subarray,
// add elements to the subarray until the sum is less than x. If the sum is greater than x,
// remove elements from the start of the current subarray.

//Kind of sliding window approach
//ALGORITHMM
//Traverse the array from start to end.
//From every index start another loop from i to the end of array to get all subarray starting from i, keep a varibale sum to calculate the sum.
//For every index in inner loop update sum = sum + array[j]
//If the sum is equal to the given sum then print the subarray.
public class SubArrayWithGivenSum2 {
    public static void main(String[] args)
    {
        int arr[] = { 15, 2, 4, 8, 9, 5, 10, 23 };
        int n = arr.length;
        int sum = 23;
        subArraySum(arr, n, sum);
    }
    static  void  subArraySum(int[] arr,int n,int sum)
    {

        int start=0,l=0;
        boolean falg=true;
        for(int i=0;i<n;i++)
        {
            start=start+arr[i];
            if(start>sum)
            {
                start=start-arr[l];
                l++;
            }
            if(start==sum)
            {
                System.out.print(l+"  "+i);
                falg=false;
                break;
            }
        }
        if(falg)
        {
            System.out.print("No subarray found");
        }
    }
}
