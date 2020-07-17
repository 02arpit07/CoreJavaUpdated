package StringCoreJavaBasics;
import java.util.*;
import java.lang.*;

/*public class StringPalindromeSpecial {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int T=s.nextInt();
        s.nextLine();
        for(int i=0;i<T;i++)
        {
            String str=s.nextLine();
            save(str);
        }
    }

    public static void save(String str)
    {
        String str1=str.toLowerCase();
        int start=0;
        int end=str1.length()-1;
        while(start<=end)
        {
            char a=str1.charAt(start);
            char b=str1.charAt(end);
            if((a<97||122<a)&&!Character.isDigit(a))
            {
                start++;
                continue;
            }
            if((b<97||122<b)&&!Character.isDigit(b))
            {
                end--;
                continue;
            }
            if(a!=b)
            {
                System.out.println("NO");
                return;
            }
            else
            {
                start++;
                end--;
            }
        }
        System.out.println("YES");
    }
}
*/
/*problem in space problems..*/
public class StringPalindromeSpecial {
    public static void main (String[] args) {
        //code
        Scanner sc=new Scanner(System.in);
        int n =Integer.parseInt(sc.nextLine());
        while(n--!=0)
        {
            boolean flag=true;
            String res="";
            String res1="";
            String s1=sc.nextLine();
            String s2=s1.toLowerCase().replaceAll("\\s","");
            char[] arr=s2.toCharArray();
            for(int i=0;i<arr.length;i++)
            {
                if(Character.isLetter(arr[i]))
                {
                    res=res+arr[i];
                }
            }
            for(int i=arr.length-1;i>=0;i--)
            {
                if(Character.isLetter(arr[i]))
                {
                    res1=res1+arr[i];
                }
            }
            if(res.length()!=res1.length())
            {
                flag=false;
            }
            else{
                for(int i=0;i<res.length();i++)
                {
                    if(res.charAt(i)!=res1.charAt(i))
                    {
                        flag=false;
                        break;
                    }

                }
            }
            if(flag)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
//*/
