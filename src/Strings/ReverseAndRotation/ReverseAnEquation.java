package Strings.ReverseAndRotation;

import java.util.Stack;

public class ReverseAnEquation {
    public static void main(String[] args)
    {
        String s = "a+b*c-d/e";
        Stack<Character> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            st.push(s.charAt(i));
        }
        for(int i=0;i<s.length();i++)
        {
            System.out.print(st.pop());
        }

    }
}
