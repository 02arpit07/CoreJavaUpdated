package Strings.StringCoreJavaBasics;

public class HackWithInfy {
    public static void main(String[] args) {
        int count = 0;

        String str = "10111100101";
        while(str.contains("101")) {
            if (str.contains("101")) {
                count++;
                str=str.replaceFirst("101", "3");
            }
        }
        System.out.println(count);
    }
}
