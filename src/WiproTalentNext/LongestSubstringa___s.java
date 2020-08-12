package WiproTalentNext;

public class LongestSubstringa___s {
    public static void main(String[] args)
    {
        String str="aasbnhtaghjkscccfftbnmkkann";
        getLargetSubstr(str);
    }
    static void getLargetSubstr(String str)
    {
        int maxSize=0;
        int start=-1;
        int end=-1;
        int finalstart=0,finalend=0;
        int finalMaxSize=0;
        boolean flag=false;
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)=='a')
            {
                start=i;
                i++;
                while (str.charAt(i)!='s')
                {
                    i++;
                }
                end=i;
                maxSize=i-start;
                if(finalMaxSize<maxSize)
                {
                    finalMaxSize=maxSize;
                    finalstart=start;
                    finalend=end;
                }
                continue;
            }

        }
        String result="";
        for(int i=finalstart;i<finalend;i++)
        {
            result=result+str.charAt(i);
        }
        System.out.print(maxSize);
    }
}
