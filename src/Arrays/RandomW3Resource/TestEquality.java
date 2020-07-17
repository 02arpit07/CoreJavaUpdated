package Arrays.RandomW3Resource;

public class TestEquality {
    public static void main(String[] arga)
    {
        int[] array1 =  {2, 5, 7, 8, 11};
        int[] array2 =  {2, 5, 7, 8, 11};
       boolean x= checkEquality(array1,array2);
       System.out.println(x);
    }
    static boolean checkEquality(int[] arr1,int[] arr2)
    {
        if(arr1.length!=arr2.length)
        {
            return false;
        }
        else{
            for(int i=0;i<arr1.length;i++)
            {
                if(arr1[i]!=arr2[i])
                {
                    return false;
                }
            }
            return true;
        }
    }
}
