package median_in_stream;

import java.util.Collections;
import java.util.PriorityQueue;

public class solution {

    public void meadian(int arr[],int n)
    {
        if(arr.length<0)
        {
            return;
        }
        PriorityQueue<Integer>minHeap=new PriorityQueue<>();
        PriorityQueue<Integer>maxHeap=new PriorityQueue<>(Collections.reverseOrder());
        // i have to make two containers and in minHeap container i have to put all large element
        maxHeap.add(arr[0]);
        for(int i=1;i<n;i++)
        {
            int x=arr[i];
            if(maxHeap.size()>minHeap.size())
            {
                if(maxHeap.peek()>x)
                {
                    minHeap.add(maxHeap.poll());
                    maxHeap.add(x);
                }
                else
                {
                    minHeap.add(x);
                }
                System.out.println(((maxHeap.peek())+(minHeap.peek()))/2);
            }
            else
            {
                if(x<=maxHeap.peek())
                {
                    maxHeap.add(x);
                }
                else
                {
                    maxHeap.add(minHeap.poll());
                    minHeap.add(x);
                }
                System.out.println((maxHeap.peek()));
            }
        }


    }
}
