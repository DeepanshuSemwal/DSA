package s_95;

import java.util.HashMap;

public class solution {
    public static long findSubarray(long[] arr ,int n)
    {
        //Your code here
        long res=0;
        HashMap<Long,Integer>hs=new HashMap<>();
        long sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
            if(sum==0)
            {
                res++;
            }
            if(hs.containsKey(sum))
            {
                res+=hs.get(sum);
                hs.put(sum,hs.get(sum)+1);
            }
            else
            {
                hs.put(sum,1);
            }

        }
        return res;

    }
}
