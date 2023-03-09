package s_35;

import java.util.HashMap;

public class solution {
    int longSubarrWthSumDivByK(int arr[], int n, int k)
    {
        // Complete the function
        int res=0;
        int sum=0;
        int rem=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        map.put(0,1);
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
             rem=sum%k;
            if(rem<0)
            {
                rem+=k;
            }
            if(map.containsKey(rem))
            {
                res+=map.get(rem);
                map.put(rem,map.get(rem)+1);

            }
            else
            {
                map.put(rem,1);
            }


        }
        return res;

    }
}
