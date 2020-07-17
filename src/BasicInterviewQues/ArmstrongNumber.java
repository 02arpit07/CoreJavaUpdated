package BasicInterviewQues;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int number =sc.nextInt();
        int sum=0;
        int num=number;
        while(num!=0)
        {
            int rem=num%10;
            sum=sum+(rem*rem*rem);
            num=num/10;
        }
        //System.out.println(sum);
        if(sum==number)
        {
            System.out.println("yes it is armstrong number");
        }
        else{
            System.out.println("No it is not");
        }
    }
}
