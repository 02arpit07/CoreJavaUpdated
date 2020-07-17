package Strings.CaseSensitiveString;

public class CamelCaseOfSentence {
    public static void main(String[] args)
    {
        String str="I got intern at geeksforgeeks";
        str=str.toLowerCase();
        String[] arr=str.split(" ");
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<arr.length;i++)
        {
            String a=arr[i];
            if(Character.isLowerCase(a.charAt(0)))
            {
                arr[i]=arr[i].replace(arr[i].charAt(0),(char)((int)arr[i].charAt(0)-32));
                sb.append(arr[i]);
            }
        }
        System.out.println(sb.toString());
    }
}
