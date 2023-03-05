package s_90;

public class solution {
    public static int minCostToMakeElementEqual(int arr[],int n)
    {
        int y=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]%2==0)
            {
                y=(arr[n/2]+arr[(n-2)/2])/2;
            }
            else
            {
                y=arr[n/2];
            }
        }
        int res=0;
        for(int i=0;i<n;i++)
        {
            res+=Math.abs(arr[i]-y);
        }
        return res;
    }
}
