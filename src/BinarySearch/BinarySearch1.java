package BinarySearch;

public class BinarySearch1 {
    public static void main(String[] args)
    {
        int[] arr={2,3,4,5,6,7,8,9};
        int elem=2;
        System.out.println("Element is found at index "+doBinarySearch(arr,elem));
        int[] arr2={9,8,7,6,5,4,3,2,1};
        int elem2 =2;
        System.out.print("Element is found at index "+doBinarySearchDesc(arr2,elem2));
    }
    //for Ascending order this function would work.
    static int doBinarySearch(int[] arr,int elem)
    {
        int start=0;
        int end=arr.length-1;
        int reult=-1;
        while(start<=end)
        {
            int mid=start+((end-start)/2);
            if(elem==arr[mid])
            {
                reult=mid;
                break;
            }
            else if(elem<arr[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return reult;
    }
    static int doBinarySearchDesc(int[] arr,int elem)
    {
        int start=0;
        int end=arr.length-1;
        int reult=-1;
        while(start<=end)
        {
            int mid=start+((end-start)/2);
            if(elem==arr[mid])
            {
                reult=mid;
                break;
            }
            else if(elem<arr[mid])
            {
                start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return reult;
    }
}
