package Collections.ListInterface;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
//LINKEDLIST  IS A CLASS WHICH IMPLEMENTS LIST INTERFACE. IT USES DOUBLY LINKED LIST TO STORE DATA INTERNALLY.
//IT CAN ACCEPT DUPLLICATE VALUES. IT IS ALSO NOT SYNCHRONIZED AND MAINTAINS INSERTION ORDER.DATA MANIPULATION IS
// FASTER HERE BECAUSE WE DONT NEED TO SHIFT DATA.
public class LinkedListBasic {
    public static void main(String[] args)
    {
        LinkedList<String> list=new LinkedList<>();
        list.add("Arpit");
        list.add("Anshul");
        list.add("Ankit");
        list.add("Antriksh");
        list.add("Arpit");
        Iterator itr=list.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
