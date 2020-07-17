package BasicInterviewQues;

public class PerfectNumber {
    public static void main(String[] args)
    {
        int num=28;
        int sum=0;
        for(int i=1;i<num;i++)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
        }
        System.out.print(sum);
        if(sum==num)
        {
            System.out.println("it is perfect number");
        }
        else{
            System.out.println("it is not a perfect number");
        }
    }
}
