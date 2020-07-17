package WiproTalentNext;

public class StringWeight {
    public static void main(String[] args)
    {
        String str="Hello World1!";
        str=str.toUpperCase();
        int sum=0;
        for(int i=0;i<str.length();i++)
        {
            if(isVowel(str.charAt(i)))
            {
                sum=sum+0;
            }
            else if(Character.isAlphabetic(str.charAt(i)))
            {
                sum=sum+(int)str.charAt(i)-'A'+1;
            }
            else{
                sum=sum+0;
            }
        }
        System.out.print(sum);
    }
    static boolean isVowel(char a)
    {
        if(a=='A'||a=='E'||a=='I'||a=='O'||a=='U')
        {
            return true;
        }
        return false;
    }

}
