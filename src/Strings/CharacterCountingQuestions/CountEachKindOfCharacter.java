package Strings.CharacterCountingQuestions;

public class CountEachKindOfCharacter {
    public static void main(String[] args)
    {
        String str="#GeeKs01fOr@gEEks07";
        int uc=0,lc=0,spcl=0,number=0;
        for(int i=0;i<str.length();i++)
        {
            if(Character.isDigit(str.charAt(i)))
            {
                number++;
            }
            else if(Character.isUpperCase(str.charAt(i)))
            {
                uc++;
            }
            else if(Character.isLowerCase(str.charAt(i)))
            {
                lc++;
            }
            else{
                spcl++;
            }
        }
        System.out.println(number);
        System.out.println(uc);
        System.out.println(lc);
        System.out.println(spcl);
    }
}
