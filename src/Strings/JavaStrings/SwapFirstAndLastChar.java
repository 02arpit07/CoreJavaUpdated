package Strings.JavaStrings;

import java.util.Scanner;

//SWAP FIRST AND LAST CHAR OF A WORD.
//GEEKS FOR GEEKS -SEEKG ROF SEEKG
public class SwapFirstAndLastChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(count(str));
    }
       static String count(String str)
       {
           char[] arr=str.toCharArray();
           for(int i=0;i<arr.length;i++)
           {
               int count=i;
               while(i<arr.length&&arr[i]!=' ')
               {
                   i++;
               }
               char temp=arr[count];
               arr[count]=arr[i-1];
               arr[i-1]=temp;
           }
           return new  String(arr);
    }
}
