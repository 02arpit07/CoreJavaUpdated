package Strings.StringBasics;

public class InitialOfName {
    public static void main(String[] args)
    {
        String str="Arpitvashisht".toUpperCase();
        getInitials(str);
    }
    static void getInitials(String str)
    {
        String[] arr=str.split(" ");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i].charAt(0));
        }
    }
}
