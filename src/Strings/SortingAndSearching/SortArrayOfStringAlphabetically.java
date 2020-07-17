package Strings.SortingAndSearching;
import java.util.*;
import java.util.HashSet;

public class SortArrayOfStringAlphabetically {
    public static void main(String[] args)
    {
        String str="abc xy bcd";
        String[] str1=str.split(" ");
        LinkedHashSet<String> hs=new LinkedHashSet<>();
        Arrays.sort(str1);
        for(int i=0;i<str1.length;i++)
        {
            hs.add(str1[i]);
        }
        Iterator itr=hs.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
}
