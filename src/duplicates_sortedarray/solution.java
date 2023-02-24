package duplicates_sortedarray;

import java.awt.*;

public class solution {
    public static int sorted(int arr[],int n)
    {
        int res=1;
        for(int i=1;i<n;i++)
        {
            if(arr[res-1]!=arr[i])
            {
                arr[res]=arr[i];
                res++;
            }
        }
        return res;
    }




}
