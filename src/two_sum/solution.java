package two_sum;

import java.util.HashMap;

public class solution {
    // problem name : two sum
    // similar problem 4sum
    public static int[] twoSum(int[] nums, int target) {


        int[] result =new int[2];
        HashMap<Integer,Integer>hs=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(hs.containsKey(target-nums[i]))
            {
                result[1]=i;
                result[0]=hs.get(target-nums[i]);
                return result;
            }
            hs.put(nums[i],i);
        }
        return result;

    }

    public static void main(String[] args) {
        int arr[]={5,7,15,-7,-9};
        int target =6;
        System.out.println(twoSum(arr,target));
    }
}
