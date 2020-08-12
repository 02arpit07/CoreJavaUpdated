package Hashing;

import java.util.HashSet;

public class StudentHashSet {
    public static void main(String[] args)
    {
        HashSet<Student> hs=new HashSet<>();
        hs.add(new Student("arpit","arpitv@gmail.com","466 sec 10",123456789));
        hs.add(new Student("poki","poki@gmail.com","466 sec 9",123456));
        hs.add(new Student("modi","modi@gmail.com","466 sec 10",1256789));
        hs.add(new Student("arpit","arpitv@gmail.com","466 sec 10",123456789));

        hs.add(new Student("arpit","arpitv@gmail.com","466 sec 10",12345678));

        for (Student S: hs)
        {
            System.out.println(S.getName()+" "+S.getEmail()+" "+S.getAddress()+" "+S.getPhno());
        }
    }
}
class Student{
    private String name;
    private String email;
    private String address;
    private int phno;

    public Student(String name, String email, String address, int phno) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phno = phno;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getAddress() {
        return address;
    }

    public int getPhno() {
        return phno;
    }

    @Override
    public boolean equals(Object obj)
    {
        Student that=(Student) obj;
        boolean isEqual=this.name.equals(that.name) && this.email.equals(that.email)&&this.address.equals(that.address)&&this.phno==that.phno;
        return isEqual;
    }
    @Override
    public int hashCode() {
        return phno+name.hashCode()+email.hashCode()+address.hashCode();
    }
}
