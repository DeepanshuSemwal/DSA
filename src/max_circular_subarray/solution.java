package max_circular_subarray;

public class solution {

    public static int normalMax(int arr[],int n)
    {
        int max_ending=arr[0];
        int res=arr[0];
        for(int i=1;i<n;i++)
        {
            max_ending=Math.max(arr[i],max_ending+arr[i]);
            res=Math.max(res,max_ending);
        }
        return res;
    }
    public static int maxSubarraySumCircular(int[] nums) {

        int normal_max=normalMax(nums,nums.length);
        if(normal_max<0)
        {
            return normal_max;
        }
        int arr_sum=0;
        for(int i=0;i<nums.length;i++)
        {
            arr_sum+=nums[i];
             nums[i]=-nums[i]; // inversion
        }
        int circular_max=arr_sum+ normalMax(nums,nums.length);
        return Math.max(normal_max,circular_max);




    }
}
