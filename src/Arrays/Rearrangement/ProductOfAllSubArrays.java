package Arrays.Rearrangement;

public class ProductOfAllSubArrays {
    static void product_subarrays(int arr[], int n)
    {
        int result = 1;
        //Efficient Approach usiing 2 loops
        for(int i = 0; i < n; i++)
        {
            int product=1;
            for(int j = i; j < n; j++)
            {
                product=product*arr[j];
                result=result*product;
            }
        }

        System.out.print(result + "\n");
    }
    public static void main(String args[])
    {
        int arr[] = { 10, 3, 7 };
        int n = arr.length;

        product_subarrays(arr, n);
    }
}

/*Native Approach
for(int i = 0; i < n; i++)
        {
        for(int j = i; j < n; j++)
        {
        for(int k = i; k <= j; k++)
        product *= arr[k];
        }
        }

 */
