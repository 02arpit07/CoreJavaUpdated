package WiproTalentNext;

public class DisplaySecondWordUpperCase {
    public static void main(String[] args)
    {
        String str="Wipro Technologies limited".trim();
        String[] strarr=str.split(" ");
        if(strarr.length<2)
        {
            System.out.println("LESS");
        }
        else {
            String result = strarr[1];
            result = result.toUpperCase();
            System.out.print(result);
        }
    }
}
