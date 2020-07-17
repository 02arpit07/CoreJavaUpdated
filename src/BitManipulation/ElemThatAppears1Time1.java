package BitManipulation;

import java.util.HashSet;
//All elements are present 3 times and only 1 element is present 1 time. return element that is present 1 time
public class ElemThatAppears1Time1 {

    public static void main(String[] args)
    {
        int a[] = {12, 1, 12, 3, 12, 1, 1, 2, 3, 2, 2, 3, 7};
        int n = a.length;
        System.out.println("The element with single " +
                "occurrence is " + singleNumber(a, n));
    }
    static int singleNumber(int[] arr,int n)
    {
        HashSet<Integer> hs=new HashSet<>();
        int arrsum=0;
        int hssum=0;
        for(int i:arr)
        {
            hs.add(i);
        }
        for(int i:arr)
        {
            arrsum=arrsum+i;
        }
        for(int i:hs)
        {
            hssum=hssum+i;
        }
        int result=(3*hssum-arrsum)/2;
        return result;
    }
}
