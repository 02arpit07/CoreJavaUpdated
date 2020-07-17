package TwoPointerAlgorithm;

public class ClosestPairFrom2SortedArrayEfficent4 {
    public static void main(String[] args)
    {
        int ar1[] = {1, 4, 5, 7};
        int ar2[] = {10, 20, 30, 40};
        int X = 38;
        getPair(ar1,ar2,ar1.length,ar2.length,X);
    }
    static void getPair(int[] arr1,int[] arr2,int arr1length,int arr2length,int X)
    {
        int res_l=0,res_r=0,diff=Integer.MAX_VALUE;

        int  l=0;
        int r=arr2.length-1;
        while(l<arr1length && r>0)
        {
            int result=Math.abs(arr1[l]+arr2[r]-X);
            if(result<diff)
            {
                diff=result;
                res_l=arr1[l];
                res_r=arr2[r];
            }
            else if(arr1[l]+arr2[r]<X)
            {
                l++;
            }
            else if(arr1[l]+arr2[r]>X)
            {
                r--;
            }
        }
        System.out.print("Sum of "+res_l+" and "+res_r+" is nearest to "+X);

    }
}
