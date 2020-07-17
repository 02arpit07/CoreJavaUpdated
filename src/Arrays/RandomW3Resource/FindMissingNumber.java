package Arrays.RandomW3Resource;

public class FindMissingNumber {
    public static void main(String[] args)
    {
        int[] arr={1,2,3,4,6,7};
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum=sum+arr[i];
        }
        int last=arr[arr.length-1];
        int result=(last*(last+1))/2;
        System.out.print(result-sum);
    }
}
