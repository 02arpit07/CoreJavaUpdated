package Concepts;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

public class PriorityQueuethoughComaparable {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        PriorityQueue<Student1> pq=new PriorityQueue<>(10,new StudentComparator());
        Student1 s1=new Student1("arpit",7.7);
        pq.add(s1);
        Student1 s2=new Student1("gandotra",8.5);
        pq.add(s2);
        Student1 s3=new Student1("punia",8.0);
        pq.add(s3);
        Student1 s4=new Student1("antriksh",7.2);
        pq.add(s4);
        //printed in descending order of cgpa.
        while(!pq.isEmpty())
        {
            System.out.println(pq.poll().getName());
        }


    }

}

class StudentComparator implements Comparator<Student1>{
    //By default ordering is done in ascending order of cgpa.But are overriding it for descending order
    public int compare(Student1 s1, Student1 s2)
    {
        if(s1.cgpa>s2.cgpa)
        {
            return -1;
        }
        else if(s1.cgpa<s2.cgpa)
        {
            return 1;
        }
        else{
            return 0;
        }

    }
}


class Student1{
    String name;
    double cgpa;
    Student1(String name,double cgpa)
    {
        this.name=name;
        this.cgpa=cgpa;
    }
    public String getName() {
        return name;
    }
}
