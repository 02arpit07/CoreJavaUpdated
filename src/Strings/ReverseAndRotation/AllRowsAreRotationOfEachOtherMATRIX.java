package Strings.ReverseAndRotation;

public class AllRowsAreRotationOfEachOtherMATRIX {
    public static void main(String[] args)
    {
        int n=3;
        int[][] mat={{1,2,3},{3,1,2},{2,3,1}};
        boolean res=checkEachRotOfMatrix(mat,n);
        System.out.println(res);
    }
    static boolean checkEachRotOfMatrix(int[][] mat,int n)
    {
        String first="";
        for(int i=0;i<n;i++)
        {
            first=first+String.valueOf(mat[0][i]);
        }
        first=first+first;
        for(int i=1;i<n;i++)
        {
            String second="";
            for(int j=0;j<n;j++)
            {
                second=second+String.valueOf(mat[i][j]);
            }
            if(first.contentEquals(second))
            {
                return false;
            }
        }
        return true;
    }
}
