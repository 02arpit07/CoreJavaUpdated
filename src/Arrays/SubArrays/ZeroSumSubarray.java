package Arrays.SubArrays;

import java.util.HashSet;

public class ZeroSumSubarray {
    //Using set we can attain  this in O(n)
    public static void main(String[] args)
    {
        int[] a={2,1,3,4,-2,-5};
        boolean found=false;
        HashSet<Integer> set=new HashSet<>();
        int sum=0;
        for(int element:a)
        {
            set.add(sum);
            sum=sum+element;
            if(set.contains(sum))
            {
                found=true;
                break;
            }
        }
        System.out.println(found);
    }
}
/*
for(int i=0;i<a.length;i++)
{
int sum=0;
for(int j=i;j<a.length;j++)
{
sum=sum+a[j];
if(sum==0)
{
found=true;
break;
}
}
if(found) break;
}
 */
