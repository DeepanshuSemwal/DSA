package s_30;

import java.util.PriorityQueue;

public class solution {

    public static int kthSmallest(int[] arr, int l, int r, int k)
    {
        //Your code here
        // min heap is created
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int res=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            pq.add(arr[i]);
        }
        while(k-->0)
        {
            res=pq.poll();
        }
        return res;

    }
}
