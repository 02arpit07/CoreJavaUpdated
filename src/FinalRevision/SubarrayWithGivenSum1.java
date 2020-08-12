package FinalRevision;

//This is simple brute force method.
public class SubarrayWithGivenSum1 {
    public static void main(String[] args)
    {
        int arr[] = { 1, 4, 20, 3, 10, 5 };
        int sum=33;
        getElementRange(arr,sum);
    }
    static  void getElementRange(int[] arr,int sum)
    {
        boolean flag=false;
        for(int i=0;i<arr.length;i++)
        {
            if(!flag) {
                int res = 0;
                for (int j = i; j < arr.length; j++) {
                    res = res + arr[j];
                    if (sum == res) {
                        System.out.print(i + " " + j);
                        flag = true;
                        break;
                    }
                }
            }
        }
    }
}
