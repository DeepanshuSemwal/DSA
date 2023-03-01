package transpose;

public class solution {
    public static void trasnpose(int arr[][])
    {
        int R= arr.length;
        int C=arr[0].length;
        int[][] temp=new int[R][C];
        for(int i=0;i<arr.length;i++)
        {
           for (int j=0;j<arr[i].length;j++)
           {
               temp[j][i]=arr[i][j];
           }

        }

        for(int i=0;i<arr.length;i++)
        {
            for (int j=0;j<arr[i].length;j++)
            {
               arr[i][j]=temp[i][j];
            }

        }

    }

    // efficient approach
    public static void transposeEfficient(int arr[][])
    {
        for(int i=0;i<arr.length;i++)
        {
            for (int j=i+1;j<arr[i].length;j++)
            {
                int temp=arr[i][j];
                arr[j][i]=arr[i][j];
                arr[i][j]=temp;
            }
        }
    }
}
