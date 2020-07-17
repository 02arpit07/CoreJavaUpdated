package BinarySearch;

public class CountOfelementInSorted4 {
    public static void main(String[] args)
    {
        int[] arr={2,2,2,4,10,10,10,18,20,20};
        int elem=20;
        System.out.println(countElem(arr,elem));
    }
    static int countElem(int[] arr,int elem)
    {
        int firstocc=findFirstOcc(arr,elem);
        int lastocc=findLastOcc(arr,elem);
        if(firstocc==lastocc)
        {
            return 1;
        }
        else if(firstocc==0)
        {
            return (firstocc+lastocc+1);
        }
        else {
            return (lastocc-firstocc+ 1);
        }
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
