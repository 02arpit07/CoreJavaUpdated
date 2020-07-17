package Strings.StringBasics;

import java.util.Scanner;

public class CheckInputIsString {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        int flag=1;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(arr[i]))
            {
                continue;
            }
            else{
                System.out.println("It is string");
                flag=0;
                break;
            }
        }
        if(flag==1)
        {
            System.out.println("it is digit");
        }
    }
}
