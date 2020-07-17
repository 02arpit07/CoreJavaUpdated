package Collections.ListInterface;

import java.util.ArrayList;

public class ArrayListRetain {
    public static void main(String[] args)
    {
        ArrayList<String> al=new ArrayList<>();
        al.add("Ravi");
        al.add("Vijay");
        al.add("Ajay");
        ArrayList<String> al2=new ArrayList<String>();
        al2.add("Ravi");
        al2.add("Hanumat");
        al.retainAll(al2);
        System.out.println(al);
        for(String str:al)
        {
            System.out.println(str);
        }

        System.out.println("Is ArrayList Empty: "+al.isEmpty());
        al.clear();
        System.out.println("Is ArrayList Empty: "+al.isEmpty());
        al.addAll(al2);
        al.set(0,"Gaurav");
        System.out.println(al);
        System.out.println(al.get(1));
    }
}
