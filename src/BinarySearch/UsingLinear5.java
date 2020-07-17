package BinarySearch;

public class UsingLinear5 {
    public static void main(String[] args)
    {
        int[] arr={12,15,18,1,2,5,6,8};//Not working for thistestcase
        System.out.println(getAns(arr,arr.length));

    }
    static int getAns(int[] arr,int len)
    {
        int max=arr[0];
        int res=-1;
        for(int i=0;i<arr.length;i++)
        {
            if(max<arr[i])
            {
                max=arr[i];
                res=i;
            }
        }
        return (res+1)%len;
    }
}
