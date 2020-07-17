package Strings.JavaStrings.ReverseString4Method;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class UsingArrayListCollection {
    public static void main(String[] ars)
    {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        char[] arr=str.toCharArray();
        ArrayList<Character> al=new ArrayList<>();
        for(char c:arr)
        {
            al.add(c);
        }
        Collections.reverse(al);
        Iterator itr=al.iterator();
        while(itr.hasNext())
        System.out.print(itr.next());

    }
}
