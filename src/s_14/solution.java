package s_14;

public class solution {
    public int maxSubArray(int[] nums) {
        int max_ending=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            max_ending=Math.max(max_ending+nums[i],nums[i]);
            res=Math.max(res,max_ending);
        }
        return res;
    }
}
