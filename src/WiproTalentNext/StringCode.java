package WiproTalentNext;

public class StringCode {
    public static void main(String[] args)
    {
        String str="WORLD WIDE WEB";
        String[] strArr=str.split(" ");
        String result="";
        for(int i=0;i<strArr.length;i++)
        {
            int a=getNumber(strArr[i]);
            result=result+a;
        }
        System.out.print(result);
    }
    static int getNumber(String str)
    {
        int sum=0;
        int low=0;
        int result=0;
        int high=str.length()-1;
        while(low<=high)
        {
            if(low==high)
            {
                sum=(int)str.charAt(low)-'A'+1;
            }
            else {
                sum = (((int) str.charAt(low) - 'A' + 1) - ((int) str.charAt(high) - 'A' + 1));
            }
            result=result+sum;
            low++;
            high--;

        }
        return result;
    }
}
