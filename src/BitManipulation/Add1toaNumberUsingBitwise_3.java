package BitManipulation;

public class Add1toaNumberUsingBitwise_3 {
    public static void main(String[] args)
    {
        System.out.println(addOne(13));

        System.out.println(addOneAlternate(13));
    }
    static int addOne(int num)
    {
        int result=-(~num);
        return result;
    }
    static  int addOneAlternate(int num)
    {
        int m =1;
        while((int)(m & num)>=1)
        {
            num=num^m;
            m<<=1;

        }
        num=num^m;
        return num;
    }
}
