package Strings.ReverseAndRotation;
//DONE BY MYSELF.
public class CountRotationDivBy4 {
    public static void main(String[] args)
    {
        String num="928160";

        int a=getTotalNumber(num);
        System.out.println(a);
    }
    static int getTotalNumber(String num)
    {
        int len=num.length();
        StringBuffer sb=new StringBuffer(num);
        sb.append(num);
        int count=0;
        for(int i=0;i<len;i++)
        {
            String str="";
            for(int j=0;j<len;j++)
            {
                 str=str+sb.charAt(i+j);
            }
            int x=Integer.parseInt(str);
            if(x%4==0)
            {
                count++;
            }
        }
        return count;
    }
}
