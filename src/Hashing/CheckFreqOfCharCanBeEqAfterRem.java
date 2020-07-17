package Hashing;

public class CheckFreqOfCharCanBeEqAfterRem {
    static int num=26;
    public static void main(String[] args)
    {
        String str = "xxxxyyzz";
        if(checkIfitisPossible(str))
        {
            System.out.println("Possible");
        }
        else{
            System.out.println("Not possible");
        }

    }
    public static boolean checkIfitisPossible(String str)
    {
        int[] freq=new int[num];
        for(int i=0;i<str.length();i++)
        {
            freq[str.charAt(i)-'a']++;
        }
        if(allSame(freq,num))
        {
            return true;
        }
        for(char ch='a';ch<'z';ch++)
        {
            int i=getindex(ch);

            if(freq[i]>0) {
                freq[i]--;

                if (allSame(freq, num)) {
                    return true;
                }
                freq[i]++;
            }
        }
        return false;
    }
    public static boolean allSame(int[] freq,int num)
    {
        int same=0;
        int i;
        for(i=0;i<num;i++)
        {
            if(freq[i]>0)
            {
                same=freq[i];
                break;
            }

        }
        for(int j=i+1;j<num;j++)
        {
            if(freq[j]>0 && freq[j]!=same)
            {
                return false;
            }
        }
        return  true;
    }
     public static int getindex(char ch)
    {
        int i=ch-'a';
        return i;
    }
}
