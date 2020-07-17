package Strings.StringCoreJavaBasics;

import java.util.Scanner;

public class CountPalindromic {
        public static int solve(String A) {
            int l=A.length();
            int count=0;
            int flag=0;
            while(l>0)
            {
                if(isPalindrome(A,l))
                {
                    flag=1;
                    break;
                }
                else
                {
                    count++;
                    A=A.substring(0,l-1);
                }
            }
            if(flag==1)
            {
                count=count+0;
            }
            return count;
        }
        static boolean isPalindrome(String A,int l)
        {
            for(int i=0,j=l-1;i<=j;i++,j--)
            {
                if(A.charAt(i)!=A.charAt(j))
                {
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            int n=solve(A);
            System.out.println(n);
        }
    }

