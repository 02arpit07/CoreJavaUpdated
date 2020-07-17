package Hashing.SecondTime;

import java.util.HashSet;
import java.util.Set;

public class HashCodeAndEquals {

    public static  void main(String[] args)
    {

        Pen p1=new Pen(10,"blue");
        Pen p2=new Pen(10,"blue");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p1==p2);
        System.out.println(p1.equals(p2));//Sme method would return false if we have not overided equals method
        Set<Pen> pens=new HashSet<>();
        pens.add(p1);
        pens.add(p2);
        //now as in next line we are printing hashset.then it would print both object despite both are equal acc to our new implemented func
        //So we need to overrride hashCode method too
        System.out.println(pens);

    }

}
class Pen{
    int price;
    String color;
    public Pen(int price,String color)
    {
        this.color=color;
        this.price=price;
    }
    @Override
    public boolean equals(Object obj)
    {
        Pen that=(Pen)obj;
        boolean isEqual=this.price==that.price && this.color.equals(that.color);
        return isEqual;
    }
    @Override
    public int hashCode() {
        return price+color.hashCode();
    }
}
