package s_265;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class solution {
    public static int[] topKFrequent(int[] nums, int k) {

        int res[]=new int[k];
        int index=0;
        HashMap<Integer,Integer>map=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            if(map.containsKey(nums[i]))
            {
                map.put(nums[i],map.get(nums[i])+1);
            }
            else
            {
                map.put(nums[i],1);
            }
        }

        PriorityQueue<Integer>pq=new PriorityQueue<>((a,b)->map.get(b)-map.get(a));
        pq.addAll(map.keySet());
        System.out.println(pq);

        for(int i=0;i<k;i++)
        {
            res[index]=pq.poll();
            index++;
        }
        return res;

    }

    public static void main(String[] args) {

        int[] nums={1,1,1,2,2,3};
        int n=nums.length;

    }
}
