package BitManipulation;

public class MultiplyIntegerWith3point5_4 {
    public static void main(String[] args)
    {
        System.out.print(getAns(3));
    }
    static int getAns(int num)
    {
        int ans=(num<<1) +num + (num>>1);
        return ans;
    }
}
