package Collections.QueueInterface;
import java.util.*;
public class HashsetRemove {
    public static void main(String[] args)
    {
        HashSet<String> set=new HashSet<String>();
        set.add("Ravi");
        set.add("Vijay");
        set.add("Arun");
        set.add("Sumit");
        System.out.println(set);
        set.remove("Ravi");
        System.out.println(set);
        HashSet<String> set1=new HashSet<String>();
        set1.add("Ajay");
        set1.add("Gaurav");
        set.addAll(set1);
        System.out.println(set);
        set.removeIf(str->str.contains("Vijay"));
        System.out.println(set);
        set.clear();
        System.out.println(set);
    }
}
