package Strings.OccurenceBasedQues;

public class FindFirstNonRepeatingCharacter {
    public static void main(String[] args)
    {
        String str="geeksforgeeks";
        char[] arr=new char[256];
        for(int i=0;i<str.length();i++)
        {
            arr[str.charAt(i)]++;
        }
        for(int i=0;i<str.length();i++)
        {
            if(arr[str.charAt(i)]==1)
            {
                System.out.println(str.charAt(i));
                break;
            }
        }
    }
}
