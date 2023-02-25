package s_24;

public class solution {
    public int maxProduct(int[] nums) {

        int min_ending=nums[0];
        int max_ending=nums[0];
        int res=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                max_ending=1;
                min_ending=1;
            }
            int temp1=nums[i]*max_ending;
            int temp2=nums[i]*min_ending;
            max_ending=Math.max(temp1,temp2);
            max_ending=Math.max(max_ending,nums[i]);
            min_ending=Math.min(temp1,temp2);
            min_ending=Math.min(min_ending,nums[i]);
            res=Math.max(res,max_ending);
        }
        return res;

    }
}
