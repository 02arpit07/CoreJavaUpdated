package Strings.StringCoreJavaBasics;

public class CipherCaeser {
    public static void main(String[] args)
    {
        String test="ATTACKATONCE";
        int n=4;
        StringBuffer sb=new StringBuffer();
        for(int i=0;i<test.length();i++)
        {
            if(Character.isUpperCase(test.charAt(i)))
            {
                char ch=(char)(((int)test.charAt(i)+n-65)%26+65);
                sb.append(ch);
            }
            else{
                char ch=(char)(((int)test.charAt(i)+n-97)%26+97);
                sb.append(ch);
            }
        }
        System.out.println(sb);
    }
}
//char ch = (char)(((int)text.charAt(i) + s - 97) % 26 + 97);
//Explanation of logic=
//A=65,(65+4-65)%26+65=4%26+65=4+65=69=E.
