package s_83;

import java.util.Arrays;

public class solution {
    long countTriplets(long arr[], int n,int sum)
    {
        Arrays.sort(arr);
        long res=0;
        for(int i=0;i<n-2;i++)
        {
            if(i==0 ||(i>0 && arr[i]!=arr[i-1]))
            {
                int target=sum-(int)arr[i];
                int low=i+1;
                int high=n-1;
                while(low<high)
                {
                    if(arr[low]+arr[high]>=target)
                    {
                        high--;
                    }
                    else if(arr[low]+arr[high]<target)
                    {
                        res+=(high-low);
                        low++;
                    }
                }

            }

        }
        return res;

    }
}
