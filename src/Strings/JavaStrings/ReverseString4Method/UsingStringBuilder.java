package Strings.JavaStrings.ReverseString4Method;

import java.util.Scanner;

public class UsingStringBuilder {
    public static void main(String[] ars)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder();
        sb.append(str);
        sb.reverse();
        System.out.println(sb);

    }
}
