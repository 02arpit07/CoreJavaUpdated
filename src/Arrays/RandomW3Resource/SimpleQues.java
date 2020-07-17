package Arrays.RandomW3Resource;

import java.util.Scanner;

public class SimpleQues {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        char[] arr=str.toCharArray();
        int length=arr.length-2;
        System.out.print(arr[0]+""+length+arr[arr.length-1]);

    }
}
