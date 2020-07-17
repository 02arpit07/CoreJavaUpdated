package Concepts;

import java.util.ArrayList;
import java.util.Collections;

public class Comparable1 {
    public static void main(String[] args)
    {
        ArrayList<Movie> al=new ArrayList<>();
        al.add(new Movie("3 Idiots",8.5,2008));
        al.add(new Movie("Avengers",6,2019));
        al.add(new Movie("Himmatwala",2,2012));
        for(Movie movie:al)
        {
            System.out.println(movie.getName()+" "+movie.getRating()+"   "+movie.getYear());
        }

        Collections.sort(al);
        System.out.println("Sorted on basis of year");
        for(Movie movie:al)
        {
            System.out.println(movie.getName()+" "+movie.getRating()+"  "+movie.getYear());
        }
    }
}
class Movie implements Comparable<Movie>
{
    //defining variables or attributes of movies.
    String name;
    double rating;
    int year;

    //function to sort the movies
    public int compareTo(Movie a)
    {
        return this.year-a.year;
    }

    Movie(String name,double rating,int year)
    {
        this.name=name;
        this.rating=rating;
        this.year=year;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    public int getYear() {
        return year;
    }
}
