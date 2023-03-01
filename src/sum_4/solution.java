package sum_4;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {

        int n=nums.length;
        List<List<Integer>>res=new ArrayList<>();
        if(nums.length==0 ||nums==null)
        {
            return res;
        }
        Arrays.sort(nums);

        for (int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int tar=target-nums[j]-nums[i];
                int low=j+1;
                int high=n-1;
                while(low<high)
                {
                    int two_sum=nums[low]+nums[high];
                    if(two_sum>tar)
                    {
                        low++;
                    }
                    else if(two_sum<tar)
                    {
                        high--;
                    }
                    else
                    {
                        List<Integer>quad=new ArrayList<>();
                        quad.add(nums[i]);
                        quad.add(nums[j]);
                        quad.add(nums[low]);
                    quad.add(nums[high]);
                    res.add(quad);
                    // to avoid duplicates
                    while(low<high && nums[low]==quad.get(2))
                    {
                        low++;
                    }
                    while (low<high && nums[high]==quad.get(3))
                    {
                        high--;
                    }

                    }

                }
                while (j+1<n && nums[j+1]==nums[j])
                {
                    j++;
                }
            }
            while (i+1<n && nums[i+1]==nums[i])
            {
                i++;
            }

        }
        return res;
    }
}
