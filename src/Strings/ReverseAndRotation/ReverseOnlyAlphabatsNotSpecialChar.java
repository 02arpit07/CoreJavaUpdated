package Strings.ReverseAndRotation;

public class ReverseOnlyAlphabatsNotSpecialChar {
    public static void main(String[] args)
    {
        String str="a!!!b.c.d,e'f,ghi";
        char[] arr=str.toCharArray();
        System.out.println("Input strings is "+str);
        reverseIt(arr);
        String str1=new String(arr);
        System.out.println("Output string is "+str1);
    }
    static  void reverseIt(char[] arr)
    {
        int l=0;
        int r=arr.length-1;
        while(l<r)
        {
            if(!Character.isAlphabetic(arr[l]))
            {
                l++;
            }
            else if(!Character.isAlphabetic(arr[r]))
            {
                r--;
            }
            else{
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
        }
    }
}
