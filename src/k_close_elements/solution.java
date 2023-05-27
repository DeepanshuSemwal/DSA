package k_close_elements;

import java.util.Comparator;
import java.util.PriorityQueue;

class Pair
{
    int diff;
    int key;
    Pair(int d,int k)
    {
        diff=d;
        key =k;
    }
    public Integer getDiff()
    {
        return diff;
    }

}
public class solution {

    // effcient approach

    public static int[] printKClosest(int[] arr, int n, int k, int x)
    {
        int res[]=new int[k];
       PriorityQueue<Pair>pq=new PriorityQueue<>(new Comparator<Pair>() {
           @Override
           public int compare(Pair p1, Pair p2) {
               return p2.getDiff().compareTo(
                       p1.getDiff());
           }
       });

       for(int i=0;i<k;i++)
       {
           pq.add(new Pair(Math.abs(arr[i]-x),arr[i]));
       }
       for(int i=k;i<n;i++)
       {
           int diff=Math.abs(arr[i]-x);
           if(pq.peek().diff>diff)
           {
               pq.poll();
               pq.add(new Pair(diff,arr[i]));

           }
       }
       int index=0;
       while(!pq.isEmpty())
       {
            res[index]=pq.poll().key;
            index++;
       }
       return res;

    }

    public static void main(String[] args) {
        int arr[]={10,15,7,3,4};
        int n=arr.length;
        printKClosest(arr,n,2,8);
    }
}
