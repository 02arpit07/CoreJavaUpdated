package Strings.CaseSensitiveString;

public class gOOGLECASE {
    public static void main(String[] args)
    {
            String str="I Work As an InterN In company".toUpperCase();
            String[] arr=str.split(" ");
            StringBuffer sb=new StringBuffer();

            for(int i=0;i<arr.length;i++) {
                if(Character.isUpperCase(arr[i].charAt(0)))
                {
                    arr[i]=arr[i].replace(arr[i].charAt(0),((char)((int)arr[i].charAt(0)+32)));
                    sb.append(arr[i]+" ");
                }

            }
            System.out.println(sb.toString());
    }
}
