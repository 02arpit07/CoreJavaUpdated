package Strings.ArithmeticOperations;

public class MaxSegmentValueAfterKbreakpoints {
    public static void main(String[] args)
    {
        String str="123321";
        int K=2;
        getMaxValue(str,K);
    }
    static void getMaxValue(String str,int k)
    {
        int segmentlen=str.length()-k;
        int result=0;
        for(int i=0;i<segmentlen;i++)
        {
            result=result*10+(str.charAt(i)-'0');
            //we will get 1233 in result after completeion of this loop.
        }
        //Now we need to check the next segments using sliding window.
        int segmentLenPow=(int)Math.pow(10,(segmentlen-1));
        int curr=result;
        for(int i=1;i<=(str.length()-segmentlen);i++)
        {
            curr=curr-(str.charAt(i-1)-'0')*segmentLenPow;  //removing 1 from 1233 to make it 233.

            curr=curr*10+(str.charAt(i+segmentlen-1)-'0');// adding trailing digit to make it 2332

            result=Math.max(curr,result);//to store bigger value in place of result.
        }
        System.out.println(result);

    }
}
