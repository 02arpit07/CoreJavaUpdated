package Strings.StringCoreJavaBasics;
import java.util.*;
import java.util.Scanner;

public class Anagrams {
    public static void main(String[] args) {
        String str1, str2;
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        while (n-- != 0) {
            str1 = sc.next();
            str2 = sc.next();
            boolean result = checkAnagrams(str1, str2);
            if (result) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

    }

    static boolean checkAnagrams(String str1, String str2) {
        boolean result = false;
        char[] a = str1.toCharArray();
        char[] b = str2.toCharArray();
        if (a.length != b.length) {
            result = false;
        } else {

            Arrays.sort(a);
            Arrays.sort(b);
            for (int i = 0; i < b.length; i++) {
                if (a[i] == b[i]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;

    }
}
