package BinarySearch;
//Here we need to check our list first and then call the accurate method.
public class AgnosticSearch2 {
    public static void main(String[] arhs)
    {
        int[] arr={9,8,7,6,5,4,3};
        int elem=50;
        System.out.println(Agnostic(arr,elem));
    }
    static int Agnostic(int[] arr,int elem)
    {
        int res=-1;
        if(arr.length>1)
        {
            if(arr[0]<arr[1])
            {
                 res=doBinarySearch(arr,elem);
            }
            else{
                res=doBinarySearchDesc(arr,elem);
            }
        }
        return res;
    }
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
