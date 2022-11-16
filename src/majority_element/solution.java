package majority_element;

public class solution {

    public int majorityElement(int[] nums) {

        //navie approach
//        int count=0;
//        int maxcount=0;
//        int index=-1;
//        for(int i=0;i<nums.length;i++)
//        {
//            for(int j=0;j<nums.length;j++)
//            {
//                if(nums[i]==nums[j])
//                {
//                    count++;
//                }
//            }
//            if(count>maxcount)
//            {
//                maxcount=count;
//                index=i;
//            }
//        }
//        if(maxcount>nums.length/2)
//        {
//            return index;
//        }
//        return index;

        // efficient approach
        int candidate=0;
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(count==0)
            {
                candidate=nums[i];
                count++;
            }
            else if(candidate==nums[i])
            {
                count+=1;
            }
            else if(candidate!=nums[i])
            {
                count-=1;
            }
        }
        return candidate;

    }

}
