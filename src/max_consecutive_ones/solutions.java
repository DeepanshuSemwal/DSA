package max_consecutive_ones;

public class solutions {
    public int findMaxConsecutiveOnes(int[] nums) {

    int res=0;
    int freq=0;
    for(int i=0;i<nums.length;i++)
    {
        if(nums[i]==1)
        {
            freq++;
            res=Math.max(res,freq);
        }
        if(nums[i]==0)
        {
            freq=0;
        }
    }
    return res;

    }
}
