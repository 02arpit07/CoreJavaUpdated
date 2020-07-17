package Hashing;

import java.util.HashMap;

public class HashMapOfUserDefinedClass {
    public static class Student{
        private int roll;
        private String name;
        Student(int roll,String name)
        {
            this.roll=roll;
            this.name=name;
        }

        public int getRoll() {
            return roll;
        }

        public void setRoll(int roll) {
            this.roll = roll;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        //Override hashcode method
        public int hashCode()
        {
            //here roll is used to have uniqueness of hashcode.
            final  int temp=14;
            int ans=1;
            ans=ans*14+roll;
            return ans;
        }
        //Equal object must generate same hashcode as long as they are same .
        public boolean equals(Object o)
        {
            if(this==o)
            {
                return true;
            }
            if(o==null)
            {
                return false;
            }
            //Not understood from here because it is internl implemeantation,focus on main method snippet of code
            if (this.getClass() != o.getClass()) {
                return false;
            }
            Student other = (Student)o;
            if (this.roll != other.roll) {
                return false;
            }
            return true;
        }
    }
    public static void main(String[] args)
    {
        HashMap<Student,String> hm=new HashMap<>();
        Student s1=new Student(1,"Arpit");
        Student s2=new Student(2,"Ram");
        hm.put(s1,s1.getName());
        hm.put(s2,s2.getName());
        System.out.println(hm.get(s1));
        System.out.println(hm.get(s2));
        Student s3=new Student(1,"ShivJi");// creating new object with same key,does not change value
        System.out.println(hm.get(s3));

    }
}
