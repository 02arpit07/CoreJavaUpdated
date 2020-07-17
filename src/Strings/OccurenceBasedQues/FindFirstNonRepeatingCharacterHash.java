package Strings.OccurenceBasedQues;

import java.util.HashMap;

public class FindFirstNonRepeatingCharacterHash {
    public static void main(String[] args)
    {
        String str="geeksforgeeks";
        getFirstOcc(str);
    }
    static void getFirstOcc(String str)
    {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++)
        {
            if(hm.containsKey(str.charAt(i)))
            {
                int count=hm.get(str.charAt(i));
                count++;
                hm.put(str.charAt(i),count);
            }
            else{
                hm.put(str.charAt(i),1);
            }
        }
        for(int i=0;i<str.length();i++)
        {
            int a=hm.get(str.charAt(i));
            if(a==1)
            {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
