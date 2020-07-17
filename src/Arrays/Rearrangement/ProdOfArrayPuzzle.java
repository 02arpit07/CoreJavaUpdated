package Arrays.Rearrangement;

public class ProdOfArrayPuzzle {
    public static void main(String[] args)
    {
        ProdOfArrayPuzzle pa=new ProdOfArrayPuzzle();
        int[] arr={1, 2, 3, 4, 5};
        int[] arr1=pa.giveAns(arr,arr.length);
        for(int i=0;i<arr1.length;i++)
        {
            System.out.print(arr1[i]+" ");
        }

    }
     int[] giveAns(int[] arr,int len) {
         int[] result = new int[len];
         int temp = 1;
         int j = 0;
         while (j != len) {
             for (int i = 0; i < len; i++) {
                 temp = temp * arr[i];
             }
             temp = temp / arr[j];
             result[j] = temp;
             j++;
             temp=1;
         }
         return result;
     }
    }
