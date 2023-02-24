package longest_alternate_odd_even;

public class solution {
    public static int res_sol(int arr[],int n)
    {
        int cur=1;
        int res=1;
        for(int i=1;i<n;i++)
        {
            if((arr[i]%2==0 && arr[i-1]%2!=0)|| (arr[i]%2!=0 && arr[i-1]%2!=0))
            {
                cur++;
                res=Math.max(cur,res);
            }
            else
            {
                cur=1;
            }
        }
        return res;
    }



}
