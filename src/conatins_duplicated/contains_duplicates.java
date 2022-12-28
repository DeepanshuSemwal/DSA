package conatins_duplicated;

import java.util.HashMap;

public class contains_duplicates {

        public boolean containsDuplicate(int[] nums) {

            HashMap<Integer,Integer> hm=new HashMap<>();
            for(int i=0;i<nums.length;i++)
            {
                hm.put(nums[i], hm.getOrDefault(nums[i],0)+1 );
                if(hm.containsKey(nums[i])&& hm.get(nums[i])>1)
                {
                    return true;
                }
            }
            return false;



        }


}
