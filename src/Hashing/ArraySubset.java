package Hashing;

public class ArraySubset {
    public static void main(String[] args)
    {
        int[] arr1={6,4,3,2,5,1};
        int[] arr2={2,3,7};
        int arr1len=arr1.length;
        int arr2len =arr2.length;
        if(checksubset(arr1,arr2,arr1len,arr2len))
        {
            System.out.println("Yes it is subset");
        }
        else{
            System.out.println("Not a subset");
        }
    }
    public static boolean checksubset(int[] arr1,int[] arr2,int arr1len,int arr2len)
    {
        int j=0;
        for(int i=0;i<arr2len;i++)
        {
            for(j=0;j<arr1len;j++)
            {
                if(arr2[i]==arr1[j])
                    break;

            }
            if(j==arr1len)
            {
                return false;
            }
        }
        return true;

    }
}
