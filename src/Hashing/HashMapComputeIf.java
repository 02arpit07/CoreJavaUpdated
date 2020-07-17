package Hashing;

import java.util.HashMap;

public class HashMapComputeIf {
    public static void main(String[] args)
    {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("Arpit",1);
        hm.put("Alishaa",2);
        hm.put("Ram",3);
        System.out.println(hm);
        hm.computeIfPresent("Arpit",(key,val1)->val1+100);
        //if i would have written a skey which is  not present ,then nothing would have happened
        System.out.println(hm);
    }
}
