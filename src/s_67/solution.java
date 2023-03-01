package s_67;

public class solution {
    public void rotate(int[][] matrix) {

        for(int i=0;i<matrix.length;i++)
        {
            for(int j=i+1;j<matrix[i].length;j++)
            {
                int temp=matrix[j][i];
                matrix[j][i]=matrix[i][j];
                matrix[i][j]=temp;
            }
        }
        for(int i=0;i<matrix.length;i++)
        {
            int low=0;
            int high= matrix.length-1;
            while(low<high)
            {
                int temp=matrix[i][low];
                matrix[i][low]=matrix[i][high];
                matrix[i][high]=temp;
                low++;
                high--;
            }
        }
    }
}
