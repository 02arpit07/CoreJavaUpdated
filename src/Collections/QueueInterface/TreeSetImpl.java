package Collections.QueueInterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetImpl {
    public static void main(String[] args)
    {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(4);
        ts.add(5);
        ts.add(8);
        ts.add(6);
        ts.add(0);
       // System.out.println(ts);
        //by default it sorts in ascending ordder
        Iterator<Integer> itr=ts.descendingIterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next());
        }
        System.out.println();
        System.out.println("smallest "+ts.pollFirst());
        System.out.println("largest  "+ts.pollLast());

    }
}
