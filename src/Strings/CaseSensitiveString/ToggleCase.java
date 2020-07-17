package Strings.CaseSensitiveString;

public class ToggleCase {
    public static  void main(String[] arrgs)
    {
        String str="HeLo Jii KeSe Ho aP";
        char[] arr=str.toCharArray();
        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==' ')
            {
                arr[i]=' ';
                continue;
            }
            arr[i]=(char)(arr[i]^32);
        }
        System.out.println(String.valueOf(arr));
    }
}
