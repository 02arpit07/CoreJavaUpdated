package PracticeLinks.PracticeLink2;

public class NextGreaterElement {
    public static void main(String[] args)
    {
        int arr[] = { 11, 13, 21, 3 };
        int n = arr.length;
        printNGE(arr, n);
    }
    public static void printNGE(int[] arr,int n)
    {

        for(int i=0;i<n;i++)
        {
            int max=-1;
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>arr[i])
                {
                    max=arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+" ||||||  "+max);
        }
    }
}
