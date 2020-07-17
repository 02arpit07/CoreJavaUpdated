package Strings.SubSequenceAndSubstrings;
//  PROBLEM NAME=>Longest subsequence where every character appears at-least k times
//INPUT str=geeksforgeeks, k=2 Output=geeksgeeks
public class SubseqEveryCharAppearsMaxKtimes {
    public static void main(String[] args)
    {
        String str="geeksforgeeks";
        int k=2;
        getOutput(str,k);

    }
    static int length=26;
    static void getOutput(String str,int k)
    {
        int[] arr=new int[length];
        for(int i=0;i<str.length();i++)
        {
            arr[str.charAt(i)-'a']++;
        }
        for(int i=0;i<str.length();i++)
        {
            if(arr[str.charAt(i)-'a']>=k)
            {
                System.out.print(str.charAt(i));
            }
        }
    }
}
