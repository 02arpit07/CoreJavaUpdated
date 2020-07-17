package Recursion.AdvancedRecursion;

public class FloodFiLL {
    public static void main(String[] args)
    {
        int[][] arr={{1,1,1,2,1,1,1},
                    {2,2,1,2,2,1,1},
                    {0,2,2,2,1,1,1},
                    {1,1,0,2,1,2,2},
                    {1,1,2,2,1,0,0}};
        floodFill(arr,0,0,0,2);
        printArray(arr);
    }
    static void floodFill(int[][] arr,int r,int c,int toFill,int prevFill)
    {
        int rows=arr.length;
        int cols=arr[0].length;
        //base condition 1
        if(r<0||r>=rows||c<0||c>=cols)
        {
            return;
        }
        //Base condition 2
        if(prevFill!=arr[r][c])
        {
            return;
        }

        arr[r][c]=toFill;

        floodFill(arr,r-1,c,toFill,prevFill);
        floodFill(arr,r,c-1,toFill,prevFill);
        floodFill(arr,r+1,c,toFill,prevFill);
        floodFill(arr,r,c+1,toFill,prevFill);

    }
    static void printArray(int[][] arr)
    {
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0;j<arr[0].length;j++)
            {
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
