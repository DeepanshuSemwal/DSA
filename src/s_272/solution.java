package s_272;

import java.awt.geom.Line2D;
import java.util.PriorityQueue;

public class solution {

    static int[] kthLargest(int k, int[] arr, int n) {
        // code here
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int res[]=new int[n];
        int index=0;
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
            if(pq.size()<k)
            {
                res[index]=-1;
                index++;
            }
            else
            {
                if(pq.size()>k)
                {
                    pq.poll();
                }

                if(pq.size()==k)
                {
                    res[index]=pq.peek();
                    index++;
                }


            }

        }
        return res;


    }
}
