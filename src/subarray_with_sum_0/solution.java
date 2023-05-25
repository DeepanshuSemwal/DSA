package subarray_with_sum_0;

import java.util.HashSet;

public class solution {

    public static boolean subArrayWithSum0(int[]arr)
    {
        HashSet<Integer>set=new HashSet<>();
        int pre_sum=0;
        for(int i=0;i<arr.length;i++)
        {
            pre_sum+=arr[i];
            if(pre_sum==0)
            {
                return true;
            }
            if(set.contains(pre_sum))
            {
                return true;
            }
            else
            {
                set.add(pre_sum);
            }

        }
        return false;
    }



}
