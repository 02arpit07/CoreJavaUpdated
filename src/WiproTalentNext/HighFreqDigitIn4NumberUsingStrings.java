package WiproTalentNext;

public class HighFreqDigitIn4NumberUsingStrings {
    public static void main(String[] args)
    {
        int num1=123;
        int num2=456;
        int num3=345;
        int num4=5043;
        System.out.print(getMaxFreqNumber(num1,num2,num3,num4));
    }
    static int getMaxFreqNumber(int num1,int num2,int num3,int num4)
    {
        String str="";
        str=str+num1+num2+num3+num4;
        int[] arr=new int[10];
        for(int i=0;i<str.length();i++)
        {
            int a=str.charAt(i)-48;
            arr[a]=arr[a]+1;
        }
        int temp=Integer.MIN_VALUE;
        int result=0;
        for(int j=0;j<10;j++)
        {
            if(arr[j]>=temp)
            {
                temp=arr[j];
                result=j;
            }
        }
        return result;


    }
}
