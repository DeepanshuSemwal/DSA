package Maximum_of_all_subarrays;

import java.util.ArrayDeque;
import java.util.ArrayList;

public class solution {

    // navie
    public int[]Max1(int arr[],int n,int k)
    {
        int res[]=new int[k];
        int index=0;
        for(int i=0;i<n-k+1;i++)
        {
            int max=arr[i];
            for(int j=i+1;j<i+k;j++)
            {
                max=Math.max(max,arr[j]);
            }
            res[index]=max;
            index++;

        }
        return res;
    }
    // effcient
    static ArrayList<Integer> max_of_subarrays(int arr[], int n, int k)
    {
        // Your code here
        // appraoch : we are maintaining a dequeue such that its index contain largest element in the given size subaary
        ArrayList<Integer>res=new ArrayList<>();
        ArrayDeque<Integer>dq=new ArrayDeque<>();
        for(int i=0;i<k;i++)
        {
            while(!dq.isEmpty() && arr[i]>=arr[dq.peek()])
            {
                dq.removeLast();
            }
            dq.addLast(i); // we are adding index
        }
        for(int i=k;i<n;i++)
        {
            res.add(dq.peek());
            while(!dq.isEmpty()&& dq.peek()<=i-k) // (i-k) we are removing the element which is not the part of the window
            {
                dq.remove();
            }
            while(!dq.isEmpty() && arr[i]>=arr[dq.peek()])
            {
                dq.removeLast();
            }
            dq.addLast(i);
        }
        res.add(arr[dq.peek()]); // the remaining element will print
        return res;

    }

}
