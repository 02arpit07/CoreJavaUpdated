package Collections.ListInterface;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Vector;

//Vector uses dynamic array for its implemetation .it is silar to arraylist .it is synchroized
// and contains many methods which are not part of collection interface.
public class VectorBasic {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
        }
        Vector<Integer> v = new Vector<>();
      /*  v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);*/
      for(int i=0;i<5;i++)
      {
          v.add(arr[i]);
      }
        Iterator<Integer> itr=v.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next()+" ");
        }
    }
}
