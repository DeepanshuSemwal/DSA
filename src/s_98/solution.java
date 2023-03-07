package s_98;

import java.util.Arrays;
import java.util.HashMap;

public class solution {
    public int minSwaps(int nums[])
    {
        // Code here
        int res=0;
        int n=nums.length;
        int [] temp=new int[n];
        for(int i=0;i<n;i++)
        {
            temp[i]=nums[i];
        }
        Arrays.sort(temp);
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],i);
        }
        for(int i=0;i<n;i++)
        {
            if(temp[i]!=nums[i])
            {
                res++;
                int init=nums[i];
                // we use init to save the element becuase it will change after swaping
                // now do swap
                int temp2=nums[i];
                nums[i]=nums[map.get(temp[i])];
                nums[map.get(temp[i])]=temp2;


                // update the value in the hashmap
                map.put(init,map.get(temp[i]));
                map.put(temp[i],i);


            }
        }
        return res;

    }
}
