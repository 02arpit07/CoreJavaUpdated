package Arrays.SubArrays;
//SOLVE THIS USING KADANES ALGORITHM
public class MaxContigousSum {
    public static void main(String[] args)
    {
        int[] arr={11,3,-4,2,5,4,-2,9};
        int maxSofar=Integer.MIN_VALUE;
        int maxEndinghere=0;
        for(int i=0;i<arr.length;i++)
        {
            maxEndinghere=maxEndinghere+arr[i];
            if(maxEndinghere>maxSofar)
            {
                maxSofar=maxEndinghere;
            }
            if(maxEndinghere<0)
            {
                maxEndinghere=0;
            }
        }
        System.out.println(maxSofar);
    }
}
