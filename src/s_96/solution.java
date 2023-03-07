package s_96;

import java.util.Arrays;

public class solution {
    public static int solve(int n, int k, int[] stalls)
    {
        Arrays.sort(stalls);
        int res=-1;
        int low=1;
        int high=stalls[n-1]-stalls[0];

        while (low<=high)
        {
            int mid=(low+high)/2;
            if(cowCanPlace(stalls,n,mid,k))
            {
                res=mid;
                low=mid+1;
            }
            else
            {
                high=mid-1;
            }
        }
        return res;

    }
    public static boolean cowCanPlace(int [] stalls,int n,int mid,int k)
    {
        int nocows=1;
        int lastSpace=stalls[0];
        for(int i=1;i<n;i++)
        {
            if((stalls[i]-lastSpace)>=mid)
            {
                nocows++;
                lastSpace=stalls[i];
            }

        }
        if(nocows>=k)
        {
            return true;
        }
        return false;
    }
}
