package Strings.JavaStrings.ReverseString4Method;

import java.util.Scanner;

public class StringtoBytes {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            byte[] arr=str.getBytes();
            byte[] array2=new byte[arr.length];
            for(int i=0;i<arr.length;i++)
            {
                array2[i]=arr[arr.length-i-1];
            }
            System.out.println(new String(array2));

    }
}
