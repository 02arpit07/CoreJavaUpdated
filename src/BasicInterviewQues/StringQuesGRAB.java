package BasicInterviewQues;

public class StringQuesGRAB {
    public static void main(String[]  args)
    {
        String str="dog";
        System.out.println(Solution(str));
    }
    static int Solution(String str)
    {
        int count=0;
        int count1=0;
        if(str.contains("aaa"))
        {
            return -1;
        }
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!='a')
            {
                count++;
            }
            else{
                count1++;
            }
        }
        int result=(int)Math.pow(2,count)-count1;
        return result;
    }
}
