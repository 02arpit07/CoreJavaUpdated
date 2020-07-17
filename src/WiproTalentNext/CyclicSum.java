package WiproTalentNext;

import java.util.ArrayList;
import java.util.Stack;

public class CyclicSum {
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
        int x=0;
        for(int t=0;t<arr.length;t++) {
            for (int j = t; j < arr.length; j++) {
                sum=sum+arr[j];
            }
        }
        System.out.print(sum);

    }
}
