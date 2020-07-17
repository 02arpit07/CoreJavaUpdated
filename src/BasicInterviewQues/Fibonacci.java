package BasicInterviewQues;

public class Fibonacci {
    public static void main(String[] args)
    {
        int num=10;
        int term1=0;
        int term2=1;
        int sum=0;
        for(int i=0;i<num;i++)
        {
            System.out.print(term1+" ");
            sum=term1+term2;
            term1=term2;
            term2=sum;
        }
    }
}
