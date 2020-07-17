package Collections.QueueInterface;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class HashSetFromArrayList {
    public static void main(String[] args)
    {
        ArrayList<Integer> al=new ArrayList<>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        al.add(4);
        al.add(3);
        HashSet<Integer> hs=new HashSet<>(al);
        hs.add(7);
        Iterator<Integer> itr=hs.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
}
