package Strings.ReverseAndRotation;

public class ReverseWordOfString {
    public static void main(String[] args)
    {
        String str="My Name Is Arpit";
        String[] arr=str.split(" ");
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
