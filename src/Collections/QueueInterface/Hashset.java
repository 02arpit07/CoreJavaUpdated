package Collections.QueueInterface;

import java.util.HashSet;
import java.util.Iterator;
//INSERTION ORDER NOT MAINTAINED AND DUPLICATES NOT ALLOWED
public class Hashset {
    public static void main(String[] args)
    {
        HashSet<String> hs=new HashSet<>();
        hs.add("Arpit");
        hs.add("Arpit");
        hs.add("Arpit");
        hs.add("Arpit");
        hs.add("Arpit");
        hs.add("Vashisht");
        hs.add("heyya");
        hs.add("kya");
        hs.add("hal");
        Iterator<String> it=hs.iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }

    }
}
