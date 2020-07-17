package PracticeLinks.PracticeLink2;

public class NextSmallerElem {
    public static void main(String[] arg)
    {
        int[] arr={4,8,5,2,25};
        for(int i=0;i<arr.length;i++)
        {
            int max=-1;
            for(int j =i+1;j<arr.length;j++)
            {
                if(arr[i]>arr[j])
                {
                    max=arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+"==="+max);
        }

    }

}
