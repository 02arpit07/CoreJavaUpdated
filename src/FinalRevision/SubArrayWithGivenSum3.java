package FinalRevision;

import java.util.HashMap;

//The prev 2 ques did not worked for negative numbers.
//Here ew will use Hashing..
public class SubArrayWithGivenSum3 {
    public static  void main(String[] args)
    {
        int[] arr = {10, 2, -2, -20, 10};
        int n = arr.length;
        int sum = -10;
        subArraySum(arr, n, sum);
    }
    static void subArraySum(int[] arr,int n,int sum)
    {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int currsum=0;
        int start=0;
        int end=-1;
        for(int i=0;i<arr.length;i++)
        {
            currsum=currsum+arr[i];

            if(currsum==sum)
            {
                start=0;
                end=i;
                break;
            }
            if(hm.containsKey(currsum-sum))
            {
                start=hm.get(currsum-sum)+1;
                end=i;
                break;
            }
            hm.put(currsum,i);

        }

        if(end==-1)
        {
            System.out.print("No subarray Found");
        }
        else{
            System.out.println(start+"   "+end);
        }

    }
}
