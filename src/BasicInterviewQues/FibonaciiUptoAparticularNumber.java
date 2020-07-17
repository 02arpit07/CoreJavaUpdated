package BasicInterviewQues;

public class FibonaciiUptoAparticularNumber {
    public static void main(String[] args)
    {
        int fibUpto=200;
        int t1=0;
        int t2=1;
        int sum=0;
        while(t1<fibUpto)
        {
            System.out.print(t1+" ");
            sum=t1+t2;
            t1=t2;
            t2=sum;

        }

    }
}
