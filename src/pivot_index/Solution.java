package pivot_index;

public class Solution {
    public int pivotIndex(int[] nums) {

        // left_sum and right_sum approach
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        int left_sum=0;
        int right_sum=sum;
        for(int i=0;i<nums.length;i++)
        {
            right_sum=right_sum-nums[i];
            if(left_sum==right_sum)
            {
                return i;
            }
            left_sum+=nums[i];
        }

        return -1;
    }
}
