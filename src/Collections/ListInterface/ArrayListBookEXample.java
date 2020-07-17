package Collections.ListInterface;

import java.util.ArrayList;
import java.util.List;

public class ArrayListBookEXample {
    public static void main(String[] args)
    {
        List<Book> al=new ArrayList<>();
        //now create books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //add books to list
        al.add(b1);
        al.add(b2);
        al.add(b3);
        //System.out.println(al);=== it will not return desired data , it will return reference if of books
        //we need to traverse through it
        for(Book b:al)
        {
            System.out.println(b.id+"        "+ b.author+"          "+b.quantity+"       "+b.publisher+"          "+  b.quantity);
        }
    }

}
class Book{
    int id;
    String name,author,publisher;
    int quantity;
    Book(int id,String name,String author,String publisher,int quantity)
    {
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;

    }
}
