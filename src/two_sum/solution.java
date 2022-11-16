package two_sum;

import java.util.HashMap;

public class solution {
    // similar problem 4sum
    public int[] twoSum(int[] nums, int target) {


        int[] result =new int[2];
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.containsKey(target-nums[i]))
            {
                result[0]=i;
                result[1]=hs.get(target-nums[i]);
                return result;
            }
            hs.put(nums[i],i);
        }
        return result;

    }
}
