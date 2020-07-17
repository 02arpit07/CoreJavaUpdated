package Collections.ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
//ARRAYLIST  IMPLEMENTS LIST INTERFACE.IT USES DYNAMIC ARRAYS TO STORE DATA OF DIFFERENT DATA TYPES,
//IT MAINTAINS AN INSERTION ORDER AND IS NON SYNCHRONIZED.IT GIVES RANDOM ACCESS TO DATA .
public class ArrayListBasic {
    public static void main(String[] args)
    {
        List<String> list=new ArrayList<String>();
        list.add("Arpit");
        list.add("Anshul");
        list.add("Ankit");
        list.add("Antriksh");
        list.add("Arpit");
        Iterator<String> itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+"   ");
        }
    }
}
