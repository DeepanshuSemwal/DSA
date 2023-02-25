package s_12;

public class solution {

    //navie
    public static int NaviefindSum(int A[],int N)
    {
        //code here
        int max_res=A[0];
        int min_res=A[0];
        for(int i=1;i<N;i++)
        {
            for(int j=i;j<N;j++)
            {
                max_res=Math.max(max_res,A[j]);
            }
        }
        for(int i=1;i<N;i++)
        {
            for(int j=i;j<N;j++)
            {
                min_res=Math.min(max_res,A[j]);
            }
        }
        return max_res+min_res;

    }

    // efficient
    public static int findSum(int A[],int N)
    {
        //code here
        int max_res=A[0];
        int min_res=A[0];
        for(int i=1;i<N;i++)
        {
            if(A[i]>max_res)
            {
                max_res=A[i];
            }
        }
        for(int i=1;i<N;i++)
        {
            if(A[i]<min_res)
            {
                min_res=A[i];
            }

        }
        return (max_res+min_res);
    }
}
