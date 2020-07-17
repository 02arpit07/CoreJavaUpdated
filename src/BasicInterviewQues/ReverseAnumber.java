package BasicInterviewQues;

public class ReverseAnumber {
    public static void main(String[] args)
    {
        int number=12343;
        int rev=0;
        int div=0;
        int num=number;
        while(num!=0)
        {
            div=num%10;
            rev=rev*10+div;
            num=num/10;
        }
        System.out.println(rev);
    }
}
