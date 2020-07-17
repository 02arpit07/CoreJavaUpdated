package Strings.ReverseAndRotation;

public class GenerateAllRotationsOfString {
    public static void main(String[] args)
    {
        String str="GEEKS";
        getRotations(str);
    }
    static void getRotations(String str)
    {
        int len=str.length();
        StringBuffer sb=new StringBuffer(str);
        sb.append(str);
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<len;j++)
            {
                System.out.print(sb.charAt(i+j));
            }
            System.out.println();
        }
    }
}
//WE ARE APPENDING STRING TO ITSELF
// like here arpit +arpit=arpitarpit. no we are printing all the rotations
