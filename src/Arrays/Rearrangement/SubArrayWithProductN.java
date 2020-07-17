package Arrays.Rearrangement;

public class SubArrayWithProductN {
    public static void main(String[] args)
    {
        int[] arr={4};
        int k=4;
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            int product=1;
            for(int j=i;j<arr.length;j++)
            {
                for(int h =i;h<=j;h++)
                {
                    product=product*arr[k];
                }
                if(product==k)
                {
                    count++;
                }
            }
        }
        System.out.print(count);
    }
    }
