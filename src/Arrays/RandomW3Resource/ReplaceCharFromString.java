package Arrays.RandomW3Resource;

public class ReplaceCharFromString {
    public static void main(String[] args)
    {
        char[] str="arpit vashisht".toCharArray();
        for(int i=0;i<str.length;i++)
        {
            if(str[i]=='a')
            {
                str[i]='\0';
            }
        }
        System.out.println(String.valueOf(str));
    }
}
