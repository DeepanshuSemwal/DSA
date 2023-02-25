package s_16;

import java.util.Arrays;

public class solution {
    public static int choclate(int arr[],int n,int m)
    {
        Arrays.sort(arr);
        int res=Integer.MIN_VALUE;
        for(int i=0;i+m-1<n;i++)
        {
            int min_diff=arr[i+m-1]-arr[i];
            res=Math.min(res,min_diff);
        }
        return res;
    }
}
