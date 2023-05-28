package minimum_cost_ropes;

import java.util.PriorityQueue;

public class solution {

    long minCost(long arr[], int n)
    {
        // your code here
        PriorityQueue<Long>pq=new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }
        long sum=0;
        long res=0;
        while(pq.size()>1)
        {
            long first=pq.poll();
            long second =pq.poll();
            sum=first+second;
            res+=sum;
            pq.add(sum);

        }
        return res;
    }
}
