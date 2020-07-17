package Collections.ListInterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayListremoveelements {
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        al.add("Anuj");
        al.add("Gaurav");
        System.out.println(al);
        al.remove("Vijay");
        System.out.println(al);
        al.remove(0);
        al.remove(al.size()-1);
        System.out.println(al);

        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        al.addAll(al2);
        System.out.println(al);
        al.removeAll(al2);
        System.out.println(al);
        al.add("Gaurav");
        al.removeIf(str->str.contains("Ajay"));//lambda func used----- means if ajay is present in the collection then remove it..
        System.out.println("After invoking removeIf() method: "+al);
        al.clear();
        System.out.println(al);

    }
}
