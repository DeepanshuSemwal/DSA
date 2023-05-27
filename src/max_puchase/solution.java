package max_puchase;

import java.util.Arrays;
import java.util.PriorityQueue;

public class solution {

    // navie : sorting based
    public static int maxPurchase1(int arr[],int n,int sum)
    {
        Arrays.sort(arr);
        int res=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<=sum)
            {
                sum-=arr[i];
                res++;
            }
            else
            {
                break;
            }
        }
        return res;
    }
    // efficent
    // using max_heap
    public static int maxPurchase(int arr[],int n,int sum)
    {
        PriorityQueue<Integer>pq=new PriorityQueue<>();
        int res=0;
        for(int i=0;i<n;i++)
        {
            pq.add(arr[i]);
        }

        while(pq.peek()<=sum)
        {
            sum-=pq.poll();
            res++;
        }
        return res;

    }


    public static void main(String[] args) {

        int arr[]={1,12,5,111,200};
        int n=arr.length;
       // System.out.println(maxPurchase(arr,n,10));
        System.out.println(maxPurchase1(arr,n,10));


    }

}
