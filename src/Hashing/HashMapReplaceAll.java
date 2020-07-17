package Hashing;

import java.util.HashMap;

public class HashMapReplaceAll {
    public static void main(String[] args)
    {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Arpit",2000);
        hm.put("alisha",2006);

        hm.put("srk",1990);

        hm.put("modi",1952);

        hm.put("pappu",2015);
        System.out.println(hm);
        hm.replaceAll((name,year)->2019-year);
        System.out.println(hm);

    }
}
