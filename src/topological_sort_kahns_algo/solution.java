package topological_sort_kahns_algo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class solution {

    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj)
    {
        // add your code here
        int res[]=new int[V];
        int in_degrre[]=new int[V];
        for(int u=0;u<V;u++)
        {
            for(int v:adj.get(u))
            {
                in_degrre[v]++;
            }
        }
        int index=0;
        Queue<Integer>queue=new LinkedList<>();
        for(int i=0;i<V;i++)
        {
            if(in_degrre[i]==0)
            {
                queue.add(i);
            }
        }
        while(!queue.isEmpty())
        {
            int u=queue.poll();
            res[index]=u;
            index++;

           for(int v:adj.get(u))
           {
               if(--in_degrre[v]==0)
               {
                   queue.add(v);
               }
           }
        }
        return res;



    }
}
