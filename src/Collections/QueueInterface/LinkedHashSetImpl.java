package Collections.QueueInterface;

import java.util.LinkedHashSet;

//Maintains insertion order.
public class LinkedHashSetImpl {
    public static void main(String[] args)
    {
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        hs.add(1);
        hs.add(5);
        hs.add(7);
        hs.add(2);
        hs.add(10);
        System.out.println(hs);
    }
}
