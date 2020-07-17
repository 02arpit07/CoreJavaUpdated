package Collections.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListaddelements {
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<>();
        System.out.println("initial "+al);
        al.add("Arpit");
        al.add("Vijay");
        al.add("Ajay");
        System.out.println(al);
        al.add(1, "Gaurav");
        System.out.println(al);
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Sonoo");
        al2.add("Hanumat");
        al.addAll(al2);
        System.out.println(al);
        ArrayList<String> al3=new ArrayList<String>();
        al3.add("John");
        al3.add("Rahul");
        al.addAll(1,al3);
        System.out.println(al);
        Iterator<String> itr=al.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }

    }
}
