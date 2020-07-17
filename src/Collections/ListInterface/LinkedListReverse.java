package Collections.ListInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListReverse {
    public static void main(String[] args)
    {
        LinkedList<String> ll=new LinkedList<>();
        ll.add("anav");
        ll.add("hjjxbxa");
        ll.add("nbmxmbm mdbkwb");
        Iterator itr=ll.descendingIterator();
        System.out.println("reverse iterator print------------");

        while (itr.hasNext())
        {
            System.out.println(itr.next());
        }
        Iterator i=ll.iterator();
        System.out.println("iterator print---------------");
        while(i.hasNext())
        {
            System.out.println(i.next());
        }
    }
}
