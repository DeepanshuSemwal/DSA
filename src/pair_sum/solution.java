package pair_sum;

import java.util.HashSet;

public class solution {

    public static boolean piarSum(int arr[],int sum)
    {
        HashSet<Integer>set=new HashSet<>();
        for(int i=0;i<arr.length;i++)
        {
            if(set.contains(sum-arr[i]))
            {
                return true;
            }
            else
            {
                set.add(arr[i]);
            }
        }
        return false;
    }
}
