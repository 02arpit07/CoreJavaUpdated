package PracticeLinks.PracticeLink2;

public class ArraySumExceptThatIndex {
    public static void main(String[] ars)
    {
        int[] arr={1,2,3,4};
        int n =arr.length;
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+arr[i];
        }
        int[] arr1=new int[n];
        for(int i=0;i<n;i++)
        {
            arr1[i]=sum-arr[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(arr1[i]+"  ");
        }
    }
}
