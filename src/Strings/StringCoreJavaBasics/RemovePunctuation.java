package StringCoreJavaBasics;

public class RemovePunctuation {
    public static void main(String[] args)
    {
        String str="Welcome???@@##$ to#$% Geeks%$^for$%^&Geeks";
        str=str.replaceAll("\\p{Punct}","");
        str=str.replaceAll("Welcome","Vannakam");
        str=str.replaceAll("m","mm");
        System.out.println(str);
    }
}
