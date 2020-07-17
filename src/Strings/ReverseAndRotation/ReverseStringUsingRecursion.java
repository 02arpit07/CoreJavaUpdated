package Strings.ReverseAndRotation;

public class ReverseStringUsingRecursion {
    public static void main(String[] args)
    {
        String str="Arpit Vashisht";
        ReverseStringUsingRecursion r=new ReverseStringUsingRecursion();
        r.findreverse(str);
    }
    void findreverse(String str)
    {
        if(str==null||str.length()<=1)
        {
            System.out.print(str);
        }
        else{
            System.out.print(str.charAt(str.length()-1));
            findreverse(str.substring(0,str.length()-1));
        }
    }
}
