package s_94;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;

public class solution {

    static PriorityQueue<Integer> max=new PriorityQueue<>(Collections.reverseOrder());
    static PriorityQueue<Integer>min=new PriorityQueue<>();
    //Function to insert heap.

    public static void insertHeap(int x)
    {
        // add your code here
        if(max.isEmpty() || max.peek()>x)
        {
            max.add(x);
        }
        else
        {
            min.add(x);
        }

        balanceHeaps();
    }

    //Function to balance heaps.
    public static void balanceHeaps()
    {
        // add your code here
        if(max.size()>min.size()+1)
        {
            min.add(max.poll());
        }
        else if(max.size()<min.size())
        {
            max.add(min.poll());
        }
        getMedian();
    }

    //Function to return Median.
    public static double getMedian()
    {
        // add your code here
        if(max.size()==min.size())
        {
            return (max.peek()+min.peek())/2;
        }
        else
        {
            return max.peek();
        }
    }
}
