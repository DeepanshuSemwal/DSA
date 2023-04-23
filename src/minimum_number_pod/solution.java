package minimum_number_pod;

public class solution {

    public static int minimumNumber(int n, int[] arr) {
        // code here
        int res=0;
        for(int i=0;i<n;i++)
        {
            res=elucid(res,arr[i]);
        }
        return res;
    }
    public static int elucid(int a,int b)
    {
        if(b==0)
        {
            return a;
        }
        else
        {
            return elucid(b,a%b);
        }
    }
}
