package BasicInterviewQues;

public class PerfectNumberWhile {
    public static void main(String[] args)
    {
        int num=28;
        int div=2;
        int count=0;
        int sum=1;
        while(true)
        {
            if(num%div==0)
            {
                sum=sum+div;
            }
            div++;
            if(div>num/2)
            {
                break;
            }
        }
        System.out.println(sum);


}

}
