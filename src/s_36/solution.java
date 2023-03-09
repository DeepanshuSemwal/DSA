package s_36;

import java.util.*;

public class solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        helper(res,nums,0);
        return res;
    }
    public void helper(List<List<Integer>> res,int nums[],int i)
    {
        List<Integer>temp=new ArrayList<>();
        if(i==nums.length)
        {
            for(int x:nums)
            {
                temp.add(x);
            }
            res.add(temp);
            return;
        }
        for(int j=i;j<nums.length;j++)
        {
            // swapping
            int temp2=nums[i];
            nums[i]=nums[j];
            nums[j]=temp2;

            helper(res,nums,i+1);
            //backtracking
            int temp3=nums[i];
            nums[i]=nums[j];
            nums[j]=temp3;

        }
        return;
    }






}
