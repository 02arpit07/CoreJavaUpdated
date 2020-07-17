package Strings.StringCoreJavaBasics;

import java.util.Scanner;

public class CheckBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=0;
        while (n-- > 0) {
            String a=sc.next();
            for(int i=0;i<a.length();i++)
            {
                if(a.charAt(i)=='1'||a.charAt(i)=='0')
                {

                }
                else
                {
                    count++;

                }
            }
            if(count>0)
            {
                System.out.println("FALSE");
            }
            else{
                System.out.println("true");
            }
        }
    }
}
