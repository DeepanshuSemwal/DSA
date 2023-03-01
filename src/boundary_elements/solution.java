package boundary_elements;

public class solution {
    public static void solution(int arr[][],int R,int C)
    {
        if(R==1)
        {
            for (int i=0;i<C;i++)
            {
                System.out.println(arr[0][i]);
            }
        }
        else if(C==1)
        {
            for(int i=0;i<R;i++)
            {
                System.out.println(arr[i][0]);
            }
        }
        else
        {
            for(int i=0;i<C;i++)
            {
                System.out.print(arr[0][i]+" ");
            }
            for(int i=C-1;i>=0;i--)
            {
                System.out.print(arr[i][C-1]+" ");
            }
            for(int i=C-2;i>=0;i--)
            {
                System.out.print(arr[R-1][i]+" ");
            }
            for(int i=R-2;i>0;i--)
            {
                System.out.print(arr[i][0]);
            }
        }
    }
}
