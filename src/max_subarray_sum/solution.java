package max_subarray_sum;

public class solution {

    public int maxSubArrayNavie(int[] nums) {

        int res=nums[0];
        for(int i=0;i<nums.length;i++)
        {
           int cur=0
            for(int j=i;j<nums.length;j++)
            {
                cur=cur+nums[j];
                res=Math.max(res,cur);
            }
        }
        return res;
    }

    //effcient approach
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

