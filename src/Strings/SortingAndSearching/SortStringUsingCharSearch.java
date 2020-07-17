package Strings.SortingAndSearching;

public class SortStringUsingCharSearch {
    public static void main(String[] args)
    {
        String str="arpitvashisht";
        String result="";
        for(int i='a';i<='z';i++)
        {
            for(int j=0;j<str.length();j++)
            {
                if(str.charAt(j)==i)
                {
                    result=result+str.charAt(j);
                }
            }
        }
        System.out.println(result);
    }
}
