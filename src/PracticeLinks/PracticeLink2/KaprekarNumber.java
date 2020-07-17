package PracticeLinks.PracticeLink2;
//we have to check if 45 is kaprekar number, 45 is true because square of 45 is 2025,then dividing 2025 in two parts ,
//we get 20 and 25 and addding them we get 45 , so it is kaprekar number
public class KaprekarNumber {
    public static void main(String[] args)
    {
        int n =45;
        int x=n;
        int rem1=0;
        int flag=1;
        while(x!=0)
        {
            rem1=x%10;
            if(rem1==0)
            {
                flag=0;
                System.out.println("false");
            }
            x=x/10;

        }
        if(flag==1) {
            System.out.println(checkNumber(n));
        }
    }
    static boolean checkNumber(int n)
    {
        int a=(n*n);
        int temp1=a;
        int len=1;
        while(temp1!=0)
        {
            len++;
            temp1=temp1/10;
        }
        int rem=0;
        int abc=1;
        while(len!=1)
        {
            int temp=a;
            rem=temp%((int)Math.pow(10,abc));
            temp=temp/((int)Math.pow(10,abc));
            abc++;
            len--;
            if((rem+temp)==n)
            {
                return true;
            }
        }
        return false;
    }
}
