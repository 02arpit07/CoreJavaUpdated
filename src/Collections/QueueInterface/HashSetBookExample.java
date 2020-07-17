package Collections.QueueInterface;

import java.util.HashSet;

public class HashSetBookExample {
    static class Book{
        int id;
        String name,author,publisher;
        int quantity;
        public Book(int id,String name,String author,String publisher,int quantity)
        {
            this.id=id;
            this.name=name;
            this.author=author;
            this.publisher=publisher;
            this.quantity=quantity;
        }
    }
    public static void main(String[] args)
    {
        HashSet<Book> hs=new HashSet<>();
        Book b1=new Book(1,"arpit","aa","basSb",4);
        Book b2=new Book(2,"cvbn","bb","bdfsfb",5);
        Book b3=new Book(3,"xcvbnm","vv","jffbb",7);
        Book b4=new Book(4,"okm","dd","sj",1);
        hs.add(b1);
        hs.add(b2);
        hs.add(b3);
        hs.add(b4);
        for(Book v:hs)
        {
            System.out.println(v.id+" "+v.name+"  "+v.author+"  "+v.publisher+"  "+v.quantity+"  ");
        }
    }
}
