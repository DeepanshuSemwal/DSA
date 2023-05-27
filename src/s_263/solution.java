package s_263;

import java.util.Arrays;

public class solution {

    long minDiff(long a[] ,int N,int K)
    {
        Arrays.sort(a);
        int i=0;
        int j=0;
        long res=Integer.MAX_VALUE;
        while(j<N)
        {
           while(j-i+1<K)
           {
               j++;
           }
           res=Math.min(res,a[j]-a[i]);
           i++;
           j++;
        }
        return res;
    }

}
