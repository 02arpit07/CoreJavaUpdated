package Hashing;

import java.util.HashMap;

public class HashMapReplace {
    public static void main(String[] args)
    {
        HashMap<String,Integer> hm=new HashMap<>();
        hm.put("a",100);
        hm.put("b",200);
        hm.put("c",300);
        hm.put("d",400);
        System.out.println(hm);
        int k=hm.replace("a",3000);//return sthe old value.
        System.out.println(k);
        System.out.println(hm);
        Integer c=hm.replace("e",23456);//if the key is not present then we would get null object that is why we nees to make an Integer variable
        System.out.println(c);
        System.out.println(hm.toString());
    }
}
