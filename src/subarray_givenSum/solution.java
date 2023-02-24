package subarray_givenSum;

public class solution {
    public boolean subarraySum(int[] nums, int sum) {

        int s=0;
        int e=0;
        int cur=0;
        for(e=0;e<nums.length;e++)
        {
            cur+=nums[e];
            while(sum<cur)
            {
                cur-=nums[s];
                s++;
            }
            if(sum==cur)
            {
                return true;
            }
        }
        return false;
    }



}
