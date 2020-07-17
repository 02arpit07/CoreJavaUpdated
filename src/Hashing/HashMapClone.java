package Hashing;

import java.util.HashMap;
import java.util.Map;

public class HashMapClone {
    //3 ways to clone hashmap are 1. use putAll method,2.use constructor 3.Native Method
    public static void main(String[] args)
    {
        HashMap<Integer,String> hm=new HashMap<>();
        hm.put(100,"a");
        hm.put(200,"b");
        hm.put(300,"c");
        hm.put(400,"d");
        System.out.println(hm);


        //Native method
        HashMap<Integer,String> newhm=new HashMap<>();
        //iterate
        for(Map.Entry<Integer,String> ab: hm.entrySet())
        {
            newhm.put(ab.getKey(),ab.getValue());
        }
        //clone map
        System.out.println("native method");
        System.out.println(newhm);


        //putAll method
        HashMap<Integer,String>  hm2=new HashMap<>();
        hm2.putAll(hm);
        System.out.println("Using putall");
        System.out.println(hm2);



        //Using contructor method
        HashMap<Integer,String> hm3=new HashMap<>(hm);
        System.out.println("Using constructor");
        System.out.println(hm3);




    }
}
