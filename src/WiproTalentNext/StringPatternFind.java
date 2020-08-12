package WiproTalentNext;

import java.util.ArrayList;
import java.util.regex.Pattern;

public class StringPatternFind {
    public static void main(String[] args)
    {
        String input1="Fi_er".toUpperCase();
        String input2="Fever:filer:Filter:Fixer:fiber:fibre:tailor:offer".toUpperCase();

        Method2(input1,input2);
    }
    static void Method1(String input1,String input2)
    {
        String[] arr1=input1.split("_");
        String[] arr2=input2.split(":");
        String first=arr1[0];
        String second=arr1[1];
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<arr2.length;i++)
        {
            if(arr2[i].startsWith(first)&&arr2[i].endsWith(second)&&arr2[i].length()==input1.length())
            {
                al.add(arr2[i]);
            }
        }
        for(int i=0;i<al.size()-1;i++)
        {
            System.out.print(al.get(i)+":");
        }
        System.out.print(al.get(al.size()-1));
    }
    //Not working method 2
    static void Method2(String input1,String input2)
    {

        String[] arr1=input1.split("_");
        String[] arr2=input2.split(":");
        String first=arr1[0];
        String second=arr1[1];
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<arr2.length;i++)
        {
            if(Pattern.matches("[FI]\\d[ER]", arr2[i]))
            {
                al.add(arr2[i]);
            }
        }
        for(int i=0;i<al.size()-1;i++)
        {
            System.out.print(al.get(i)+":");
        }
        System.out.print(al.get(al.size()-1));
    }
}
