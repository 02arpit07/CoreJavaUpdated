package JavaAdditionalConceptQues;

import java.util.Enumeration;
import java.util.Vector;

public class Enumeration1 {
    public static void main(String[] args)
    {
        //Iterator is advanced version of enumeration.
        // In iterator we can also delete while traversing but not in enumeration

        // create enumeration
        Enumeration Days;
        Vector week = new Vector();

        week.add("Sunday");
        week.add("Monday");
        week.add("Tuesday");
        week.add("Wednesday");
        week.add("Thursday");
        week.add("Friday");
        week.add("Saturday");
        Days = week.elements();

        // get the iterator
        while (Days.hasMoreElements())
        {
            System.out.print(Days.nextElement()+" ");
        }
    }
}
