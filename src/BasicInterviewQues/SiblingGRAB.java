package BasicInterviewQues;

import java.util.Arrays;
import java.util.Collections;

public class SiblingGRAB {
    public static void main(String[] args) {
        int n = 12232;
        String str = n + "";
        System.out.println(str);
        char[] arr=str.toCharArray();
        Arrays.sort(arr);

        StringBuffer sb = new StringBuffer(String.valueOf(arr));
        sb.reverse();
        System.out.print(sb);
    }

}
