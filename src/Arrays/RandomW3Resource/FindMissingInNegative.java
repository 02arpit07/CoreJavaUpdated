package Arrays.RandomW3Resource;

import java.util.Arrays;

public class FindMissingInNegative {
    public static void main(String[] args)
    {
        int arr[] = {-5,-3,-2,-1,0,1,2,3,4};
        int arr_size = arr.length;
        Arrays.sort(arr);
       int result= getMissingElement(arr,arr_size);
       if(result!=-111)
       System.out.print(result);
       else{
           System.out.println("No missing element");
       }
    }
    static int getMissingElement(int[] arr,int arr_size)
    {
        for(int i=0;i<arr_size-1;i++)
        {
            int x=arr[i];
            int y=arr[i]+1;
            if(arr[i+1]!=y)
            {
                return y;
            }
        }
        return -111;
    }
}
