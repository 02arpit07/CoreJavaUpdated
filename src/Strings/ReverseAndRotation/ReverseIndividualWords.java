package Strings.ReverseAndRotation;

import java.util.Stack;

public class ReverseIndividualWords {
    public static void main(String[] args)
    {
        String str="Hello I am Arpit";
        ReverseTheString(str);
    }
    static void ReverseTheString(String str)
    {
        int n=str.length();
        Stack<Character> st=new Stack<>();
        for(int i=0;i<n;i++) {
            if (str.charAt(i) != ' ') {
                st.push(str.charAt(i));
            } else {
                while (!st.isEmpty()) {
                    System.out.print(st.pop());
                }
                System.out.print(" ");
            }
        }
        while(!st.isEmpty())
        {
            System.out.print(st.pop());
        }
    }
}
