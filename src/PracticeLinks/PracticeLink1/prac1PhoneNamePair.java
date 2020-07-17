package PracticeLinks.PracticeLink1;

import java.util.HashMap;
import java.util.Scanner;

public class prac1PhoneNamePair {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        HashMap<String,Long> hm=new HashMap<>();
        int n =sc.nextInt();
        while(n--!=0) {
            Long phone = sc.nextLong();
            String str = sc.next();
            hm.put(str, phone);

        }

            for (int i = 0; i < n; i++) {
                String str1 = sc.next();
                Long a = hm.get(str1);
                System.out.print(a);

        }
    }
}
