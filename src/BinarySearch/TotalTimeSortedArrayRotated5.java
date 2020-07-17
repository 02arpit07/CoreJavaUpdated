package BinarySearch;

public class TotalTimeSortedArrayRotated5 {
    public static void main(String[] args)
    {
        int[] arr={11,12,15,18,19,20,21,22,2,5,6,8};//Not working for thistestcase
       System.out.println(getAns(arr,arr.length));

    }
    static int getAns(int[] arr,int N)
    {
        int start=0;
        int end=arr.length-1;
        int result=-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            int next=(mid+1)%N;
            int prev=(mid+N-1)%N;

            if(arr[mid]<=arr[next]&&arr[mid]<=arr[prev])
            {
                return mid;
            }
            if(arr[mid]>=arr[mid+1])
            {
                return mid+1;
            }
            if(arr[start]<=arr[mid])
            {
                start=mid+1;
            }
            else if(arr[mid]<=arr[end])
            {
                end=mid-1;
            }
        }
        return result;
    }
}
