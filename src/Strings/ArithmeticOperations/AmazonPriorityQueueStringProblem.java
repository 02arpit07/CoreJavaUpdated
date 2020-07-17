package Strings.ArithmeticOperations;

import java.util.Comparator;
import java.util.PriorityQueue;

//PROBLEM NAME-Minimum sum of squares of character counts in a given string after removing k characters
//TEST CASES-Input :  str = abccc, K = 1
//Output :  6
//We remove c to get the value as 1^2 + 1^2 + 2^2
//
//Input :  str = aaab, K = 2
//Output :  2
//Things to remember are that we need to remove(K)elements which are having highest frequency
public class AmazonPriorityQueueStringProblem {
    static class IntCompare implements Comparator<Integer>{
        public int compare(Integer arg1,Integer arg2)
        {
            if(arg1>arg2)
            {
                return -1;
            }
            else if(arg1<arg2)
            {
                return 1;
            }
            else{
                return 0;
            }
        }
    }
    static final int Max=26;
    public static void main(String[] args)
    {
        String str="abbccc";
        int k=2;//how many times we need to delete one max occuring char. like in above string a will be deleted.
        System.out.println(getMinStringValue(str,k));

    }
    static int getMinStringValue(String str,int k)
    {
        int leng=str.length();
        //if no of deleting char is more that string length;
        if(k>leng)
        {
            return 0;
        }
        //create array to store frequency.
        int[] freq=new int[Max];
        for(int i=0;i<leng;i++)
        {
            freq[str.charAt(i)-'a']++;
        }
        //create comparator object
        Comparator<Integer> c=new IntCompare();//or if we dont want to write this line. we can write -
        //new IntCompare() int priorityqueue line instea of c.

        //Make a priority quweue
        PriorityQueue<Integer> pq=new PriorityQueue<>(5,c);
        for(int i=0;i<Max;i++)
        {
            if(freq[i]!=0)
            {
                pq.add(freq[i]);
            }
        }
        //Removal of K characters
        while(k--!=0)
        {
            int temp= pq.peek();//largest freq will be peeked.
            pq.poll();//delete that largest freq
            temp=temp-1;//decrement that largest freq by 1 stored in temp variable
            pq.add(temp);//no add that to queue
        }
        //Now we can find the result of the remaining frequencies.
        int result=0;
        while(!pq.isEmpty())
        {
            int temp=pq.peek();
            result=result+(temp*temp);
            pq.poll();
        }
        return result;

    }

}
