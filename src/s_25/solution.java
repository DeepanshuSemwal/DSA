package s_25;



public class solution {
    public int findMin(int[] nums) {

        int n=nums.length;
        int low=0;
        int high=n-1;
        if(nums[low]<=nums[high])
        {
               return nums[0];
        }
        while(low<=high)
        {
            int mid=(low+high)/2;
            if(nums[mid]>nums[mid+1])
            {
                return nums[mid+1];
            }
            else if(nums[mid]<nums[mid-1])
            {
                return nums[mid];
            }
            else if(nums[low]<=nums[mid])
            {
                low=mid+1;
            }
            else if(nums[mid]<=nums[high])
            {
                high=mid-1;
            }
        }
        return -1;

    }
}
