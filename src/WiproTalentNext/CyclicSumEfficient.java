package WiproTalentNext;

import java.util.Stack;

public class CyclicSumEfficient {
    public static void main(String[] args)
    {
        int num=582109;
        Stack<Integer> st=new Stack<>();
        while(num!=0)
        {
            st.push(num%10);
            num=num/10;
        }
        int[] arr=new int[st.size()];
        int i=0;
        while(!st.empty())
        {
            arr[i]=st.pop();
            i++;
        }
        int sum=0;
        for(int j=0;j<arr.length;j++)
        {
            sum=sum+arr[j];
        }

        int temp=0;
        int result=arr.length*sum;
        for (int j=0;j<arr.length-1;j++)
        {
            temp=temp+arr[j];
            result=result-temp;
        }
        System.out.print(result);
    }
}
