package BinarySearch;

public class FirstOccLastOcc3 {
    public static void main(String [] args)
    {
        int[] arr={2,3,4,10,10,10,10,18,20};
        //find first or last occurence of 10
        int elem=10;
        System.out.println(findLastOcc(arr,elem));

    }
    static int findFirstOcc(int[] arr,int elem)
    {
        int start=0;
        int end=arr.length-1;
        int res=-1;
        while(start<=end)
        {
            int mid=start+((end-start)/2);
            if(elem==arr[mid])
            {
                res=mid;
                end=mid-1;
            }
            else if(elem<arr[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }
    static int findLastOcc(int[] arr,int elem)
    {
        int start=0;
        int end=arr.length-1;
        int res=-1;
        while(start<=end)
        {
            int mid=start+((end-start)/2);
            if(elem==arr[mid])
            {
                res=mid;
                start=mid+1;
            }
            else if(elem<arr[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return res;
    }
}
