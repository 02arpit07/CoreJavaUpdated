package Arrays.Rotation;

public class MaxSumArr {
    public static void main(String[] args)
    {
        int arr[] = new int[]{10, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        MaxSumArr m=new MaxSumArr();
        int result=m.getMax(arr,arr.length,arr.length);
        System.out.println(result);
    }
    int MaxSum=0;
    int getMax(int[] arr,int len,int n)
    {
        boolean flag=false;
        int arrSum=0;
        for(int i=0;i<len;i++)
        {
            arrSum=arrSum+(i*arr[i]);
        }
        if(MaxSum<arrSum) {
            MaxSum = arrSum;
        }
            while (n > 1) {
                rotateArrayBy1(arr);
                n=n-1;
                if(n!=1) {
                    getMax(arr, len, n);
                }
            }

        return MaxSum;
    }
    static int[] rotateArrayBy1(int[] arr)
    {
        int temp=arr[0];
        for(int i=0;i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1]=temp;
        return arr;
    }
}
