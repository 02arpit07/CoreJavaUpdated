package Concepts;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;

//WORKING OF COMPARATOR INTERFACE
public class Comparator1 {
    public static void main(String[] args)
    {
        ArrayList<Student> al=new ArrayList<>();
        al.add(new Student(222,"aaaa","Mumbai"));
        al.add(new Student(111,"bbbb","Mumbai"));
        al.add(new Student(333,"rysa","Delhi"));
        System.out.println("UNSORTED");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
        Collections.sort(al ,new SortByRoll());
        System.out.println("Sort by roll number");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }
        Collections.sort(al,new Sortbyname());
        System.out.println("Sort By Names");
        for(int i=0;i<al.size();i++)
        {
            System.out.println(al.get(i));
        }

    }

}

class SortByRoll implements Comparator<Student>
{
    public int compare(Student a,Student b)
    {
        return a.roll-b.roll;
    }
}

class Sortbyname implements Comparator<Student>
{
    public int compare(Student a, Student b)
    {
        return a.name.compareTo(b.name);
    }
}

class  Student{
    int roll;
    String name,address;

    public Student(int roll,String name,String address)
    {
        this.roll=roll;
        this.name=name;
        this.address=address;
    }
    //Next method is used to print data in student object in main method
    public String toString()
    {
        return this.roll+" "+this.name+" "+this.address;
    }
}

