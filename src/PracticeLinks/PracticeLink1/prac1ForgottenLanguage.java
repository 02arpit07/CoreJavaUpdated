package PracticeLinks.PracticeLink1;

import java.util.Scanner;

public class prac1ForgottenLanguage {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        {
            while(t--!=0)
            {
                int a=sc.nextInt();
                int b =sc.nextInt();
                boolean[] arr=new boolean[a];
                String[] forgot=new String[a];
                for(int i=0;i<a;i++)
                {
                    forgot[i]=sc.next();
                }
                while(b--!=0)
                {
                    int n=sc.nextInt();
                    String[] modern=new String[n];
                    for(int i=0;i<n;i++)
                    {
                        modern[i]=sc.next();
                    }
                    for(int i=0;i<a;i++)
                    {
                        for(int j=0;j<n;j++)
                        {
                            if(forgot[i].equals(modern[j]))
                            {
                                arr[i]=true;
                            }
                        }
                    }
                }
                for(int i=0;i<a;i++)
                {
                    if(arr[i])
                    {
                        System.out.print("TRUE"+" ");
                    }
                    else{
                        System.out.print("FALSE"+" ");
                    }
                }
                System.out.println();
            }
        }
    }
}
/*
2
3
2
piygu
ezyfo
rzotm
1
piygu
6
tefwz
tefwz
piygu
ezyfo
tefwz
piygu
TRUE TRUE FALSE
4
1
kssdy
tjzhy
ljzym
kegqz
4
kegqz
kegqz
kegqz
vxvyj
FALSE FALSE FALSE TRUE
 */
