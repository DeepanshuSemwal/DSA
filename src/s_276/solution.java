package s_276;

import java.util.ArrayList;
import java.util.HashMap;

public class solution {

    int maxLen(int arr[], int n)
    {
        // Your code here
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum=0;
        int res=0;
        int cur_sum=0;
        for(int i=0;i<n;i++)
        {
            cur_sum+=arr[i];
            if(cur_sum==sum)
            {
                res=i+1;
            }
            if(map.containsKey(cur_sum-sum))
            {
                res=Math.max(res,i-map.get(cur_sum));
            }
            else
            {
                map.put(cur_sum,i);
            }
        }
        return res;
    }


}
