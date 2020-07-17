package StringCoreJavaBasics;
import java.util.*;
import java.lang.*;

class Rough {
    public static void main (String[] args) {
       /* Scanner sc = new Scanner(System.in);
        String str=sc.next();
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            char a=(char)(((int)arr[i])+1);
            System.out.print(a+" ");
        }*/
            //code
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t--!=0)
        {
            String str1=sc.next();
            String str2=sc.next();
            char[] arr=str1.toCharArray();
            char[] arr2=str2.toCharArray();
            boolean flag=true;
            int y =arr.length;
            for(int i=0;i<arr.length;i++)
            {
                int f=i;
                int l=(i+2)%arr.length;
                if(arr[f]==arr2[l])
                {
                    continue;
                }
                else{
                    flag=false;
                }
            }
            if(!flag)
            {
                flag=true;
                for(int i=arr.length-1;i>=0;i--)
                {
                    int f=i;
                    int l=(i-2);
                    if(l<0)
                    {
                        l=y-Math.abs(l);
                    }
                    if(arr[f]==arr2[l])
                    {
                        continue;
                    }
                    else{
                        flag=false;
                    }
                }
            }

            if(flag)
            {
                System.out.println("1");
            }
            else{
                System.out.println("0");
            }
        }
        }
    }
