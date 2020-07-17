package Strings.ReverseAndRotation;

public class ReverseStringWithoutUsingExtraSpace {
    public static void main(String[] args)
    {
        String str="Arpit Vashisht is my name";
        System.out.println(reverseKar(str));
    }
    static String reverseKar(String str)
    {
        char[] arr=str.toCharArray();
        int r=str.length()-1;
        int l=0;
        while(l<r)
        {
            arr[l]^=arr[r];
            arr[r]^=arr[l];
            arr[l]^=arr[r];
            l++;
            r--;
        }
        return String.valueOf(arr);
    }
}
   /*  Second way (Easier way)
    public static void main(String[] args)
    {
        String str="Arpit Vashisht is my name";
        StringBuffer sb=new StringBuffer(str);
        sb.reverse();
        System.out.println(sb.toString());
    }

    */
