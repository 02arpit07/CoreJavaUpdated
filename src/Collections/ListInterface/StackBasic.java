package Collections.ListInterface;

import java.util.Iterator;
import java.util.Stack;
import java.util.Vector;
//Stack is subclass of VECTOR. it implements all methods of vectors.it also implemets its own methods
//like push(),peek(),push(Object o) etc.it implements lifo or filo mechanism.
public class StackBasic {
    public static void main(String[] args)
    {
        Stack<String> st = new Stack<>();
        st.add("Arpit");
        st.add("Anshul");
        st.add("ankit");
        st.add("antri");
        st.add("arpit");
        st.pop();
        Iterator<String> itr=st.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
        System.out.println();
        System.out.println(st);
    }
}
