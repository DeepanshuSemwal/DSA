package tapping_rain;

public class solution {

    // navie approach
    public static int getwater(int arr[],int n)
    {
        int l_max=0;
        int r_max=0;
        int res=0;
        for(int i=1;i<n-1;i++)
        {
            // find l_max
            for(int j=0;j<i;j++)
            {
                l_max=Math.max(arr[i],arr[j]);
            }
            // find right max
            for(int j=i+1;j<n;j++)
            {
                r_max=Math.max(arr[i],arr[j]);
            }
            res+=(Math.min(l_max,r_max)-arr[i]);

        }
        return res;
    }

    // efficeint approach
    public static int getwater2(int arr[],int n)
    {
        int res=0;
        //l_max array
        int l_max[]=new int[n];
        l_max[0]=arr[0];
        // r_max
        int r_max[]=new int[n];
        r_max[0]=arr[n-1];
        for(int i=1;i<n;i++)
        {
            l_max[i]=Math.max(arr[i],l_max[i-1]);
        }
        for(int i=n-2;i>=0;i--)
        {
            r_max[i]=Math.max(arr[i],r_max[i+1]);
        }
        for(int i=1;i<n-1;i++)
        {
            res+=(Math.min(l_max[i],r_max[i])-arr[i]);
        }
        return res;
    }
}
