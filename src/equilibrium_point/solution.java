package equilibrium_point;

public class solution {

    // navie
    public static boolean equilibrium(int arr[],int n)
    {
        for(int i=0;i<n;i++)
        {
            int l_sum=0;
            int r_sum=0;
            for(int j=0;j<i;j++)
            {
                l_sum+=arr[j];
            }
            for(int j=i+1;j<n;j++)
            {
                r_sum+=arr[j];
            }
            if(l_sum==r_sum)
            {
                return true;
            }

        }
        return false;
    }

    // efficient apporach
    public static boolean equilibrium2(int arr[],int n)
    {
        // 1.compute prefix sum
        //2. compute suffix sum
        int sum=0;
        int r_sum=0;
        int l_sum=0;

        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }
        r_sum=sum;
        for(int i=0;i<n;i++)
        {
            r_sum-=arr[i];
            if(l_sum==r_sum)
            {
                return true;
            }
            l_sum+=arr[i];
        }
        return false;
    }
}
