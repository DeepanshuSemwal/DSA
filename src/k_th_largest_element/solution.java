package k_th_largest_element;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class solution {
    public static int findKthLargest(int[] nums, int k) {

        int ans=0;
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        for(int i=0;i<nums.length;i++)
        {
            pq.add(nums[i]);
        }
        while(k-->0)
        {
            ans=pq.poll();
        }
        return ans;

    }
    public static void main(String[] args) {


    }
}
