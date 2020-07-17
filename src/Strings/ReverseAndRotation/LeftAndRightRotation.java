package Strings.ReverseAndRotation;

public class LeftAndRightRotation {
    public static void main(String [] args)
    {
        String str="GeeksforGeeks";
        int rotateBy=2;
        System.out.println(LeftRotate(str,rotateBy));
        System.out.println(RightRotate(str,rotateBy));
    }
    static String LeftRotate(String  str,int k)
    {
        int len =str.length();
        String result=str.substring(k,len)+str.substring(0,k);
        return result;

    }
    static String RightRotate(String str,int k)
    {
        int len=str.length();
        String result=str.substring(len-k,len)+str.substring(0,len-k);
        return result;
    }
}
