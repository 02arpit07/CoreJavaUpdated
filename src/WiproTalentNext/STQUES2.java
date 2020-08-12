package WiproTalentNext;

import java.util.ArrayList;
import java.util.HashSet;

public class STQUES2 {
    public static void main(String[] args)
    {
        int num1=10,num2=220,num3=30,num4=40,num5=50;
        System.out.println(getAns(num1,num2,num3,num4,num5));
    }
    static int getAns(int num1,int num2,int num3,int num4,int num5)
    {
        int stable=0;
        int unstable=0;
        ArrayList<Integer> al=new ArrayList<>();
        al.add(num1);
        al.add(num2);
        al.add(num3);
        al.add(num4);
        al.add(num5);
        for(int i=0;i<al.size();i++)
        {
            if(checkStable(al.get(i)))
            {
                stable=stable+al.get(i);
            }
            else {
                unstable=unstable+al.get(i);
            }
        }
        return stable-unstable;
    }
    static boolean checkStable(int num)
    {
        HashSet<Integer> hs=new HashSet<>();
        int rem=0;
        int[] arr=new int[10];
        int tempum=num;
        while(num!=0)
        {
            rem=num%10;
            arr[rem]++;
            num=num/10;
        }
        for(int i=0;i<arr.length;i++)
        {
            hs.add(arr[i]);
        }
        if(hs.size()>2)
        {
            return  false;
        }
        else {
            return true;
        }
    }
}
