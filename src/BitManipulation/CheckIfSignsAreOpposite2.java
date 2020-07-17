package BitManipulation;

public class CheckIfSignsAreOpposite2 {
    public static void main(String[] args)
    {
            int x = 100, y = -10;
            if (oppositeSigns(x, y) == true)
                System.out.println("Signs are opposite");
            else
                System.out.println("Signs are not opposite");
    }
    static boolean oppositeSigns(int x,int y)
    {
        return (x^y)<0;
    }
}
