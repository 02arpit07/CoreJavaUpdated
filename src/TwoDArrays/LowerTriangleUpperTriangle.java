package TwoDArrays;

public class LowerTriangleUpperTriangle {
    public static void main(String args[]) {
        int matrix[][] = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int n=3;
        lowerTri(matrix,n);
        System.out.println("upper triangle of mat is");
        upperTri(matrix,n);
    }
    static void lowerTri(int[][] mat,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<j)
                {
                    System.out.print("0");
                }
                else{
                    System.out.print(mat[i][j]);
                }
            }
            System.out.println();
        }
    }
    static void upperTri(int[][] mat,int n)
    {
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>j)
                {
                    System.out.print("0");
                }
                else{
                    System.out.print(mat[i][j]);
                }
            }
            System.out.println();
        }
    }

}
