package WiproTalentNext;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class HighFreqDigitin4Numbers {
    public static void main(String[] args)
    {
        int num1=123;
        int num2=456;
        int num3=345;
        int num4=5043;
        System.out.print(getMaxFreqNumber(num1,num2,num3,num4));
    }
    static int getMaxFreqNumber(int num1,int num2,int num3,int num4)
    {

        int[] resultantArr=new int[10];
        ArrayList<Integer> al=new ArrayList<>();
        al.add(num1);
        al.add(num2);
        al.add(num3);
        al.add(num4);
        int size=al.size();
        int i=0;
        while (size--!=0)
        {
           int num=al.get(i);
           int rem=0;
           while(num!=0)
           {
               rem=num%10;
               num=num/10;
               resultantArr[rem]=resultantArr[rem]+1;
           }
           i++;
        }
        int temp=Integer.MIN_VALUE;
        int result=0;
        for(int j=0;j<resultantArr.length;j++)
        {
            if(resultantArr[j]>=temp)
            {
                temp=resultantArr[j];
                result=j;
            }
        }
        return result;
    }
}
