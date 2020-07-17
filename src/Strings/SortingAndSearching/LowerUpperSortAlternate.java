package Strings.SortingAndSearching;

public class LowerUpperSortAlternate {
    public static void main(String[] args)
    {
        String str="bAwutndekWEdkd";
        char[] arr=str.toCharArray();
        String upper="";
        String lower="";
        for(int i=0;i<arr.length;i++)
        {
            if(Character.isUpperCase(str.charAt(i)))
            {
                upper=upper+str.charAt(i);
            }
            else {
                lower=lower+str.charAt(i);
            }
        }
        int n =arr.length;
        int i=0;
        String result="";
        while(n--!=n/2)
        {
            if(i<upper.length()) {
                result = result + upper.charAt(i);
            }
            if(i<lower.length()) {
                result = result + lower.charAt(i);
            }
            i++;
        }
        System.out.print(String.valueOf(result));
    }
}
