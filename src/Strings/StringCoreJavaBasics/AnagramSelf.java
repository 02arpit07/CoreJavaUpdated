package Strings.StringCoreJavaBasics;
import java.util.*;
import java.lang.*;

public class AnagramSelf {
    public static void main (String[] args) {
        //code
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        while(n--!=0)
        {
            String str=sc.next();
            String str1=sc.next();
            ArrayList<Character> al=new ArrayList<>();
            char[] arr1=str.toCharArray();
            char[] arr2=str1.toCharArray();
            for(int i=0;i<arr1.length;i++)
            {
                al.add(arr1[i]);
            }
            boolean flag=true;
            for(int i=0;i<arr2.length;i++)
            {
                if(!al.contains(arr2[i]))
                {
                    flag=false;
                    break;
                }
            }
            if(arr1.length!=arr2.length)
            {
                flag=false;
            }
            if(flag)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }

}



