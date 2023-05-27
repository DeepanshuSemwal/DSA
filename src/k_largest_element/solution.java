package k_largest_element;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

public class solution {

    // navie approach : sorting
    public static int kLargestElement1(int arr[],int n,int k)
    {
        Arrays.sort(arr);
        int res=0;
        for(int i=n-1;i>=k;i--)
        {
            res++;
        }
        return res;
    }

    // effcient appraoch
    public static int[] kLargestElement(int arr[],int n,int k)
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>(Collections.reverseOrder());
        int res[]=new int[k];
        int index=0;
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }

        for(int i=0;i<k;i++)
        {
           res[index]=pq.poll();
           index++;
        }
        return res;

    }
}
