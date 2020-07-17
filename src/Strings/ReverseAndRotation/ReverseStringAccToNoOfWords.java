package Strings.ReverseAndRotation;
/*Done this but the only diff left is that my outupt for given input is
vadaY tupjaR ridnuP Ashish Abhishek Sunil
And expected according to gfg ques was
ridnuP tupjaR vadaY Ashish Abhishek Sunil
//i guess to solve this problem i should have used stack instead of arraylist.
*/
import java.util.ArrayList;

public class ReverseStringAccToNoOfWords {
    public static void main(String[] ars)
    {
        String str="Ashish Yadav Abhishek Rajput Sunil Pundir";
        String[] arr=str.split(" ");
        ArrayList<String> al=new ArrayList<>();
        ArrayList<String> al2=new ArrayList<>();
        int n=arr.length;
        StringBuffer sb=new StringBuffer();
        if(n%2==0)
        {
            for(int i=0;i<arr.length;i++)
            {
                if((i+1)%2==0)
                {
                    sb.append(arr[i]);
                    sb.reverse();
                    al.add(sb.toString());
                    sb.delete(0,sb.length());
                }
                else{
                    al2.add(arr[i]);
                }

            }
            al.addAll(al2);
        }
        else{


            for(int i=0;i<arr.length;i++)
            {
                if((i+1)%2!=0)
                {
                    sb.append(arr[i]);
                    sb.reverse();
                    al.add(sb.toString());
                    sb.delete(0,sb.length());
                }
                else{
                    al2.add(arr[i]);
                }

            }
            al.addAll(al2);

        }
        for(String i:al)
        {
            System.out.print(i+" ");
        }
    }
}
// done by my method.
