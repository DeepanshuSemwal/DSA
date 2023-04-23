package dijkstra_algorithm;

import java.util.ArrayList;
import java.util.PriorityQueue;

class Pair
{
    int distance;
    int node;
    Pair(int distance,int node)
    {
        this.distance=distance;
        this.node=node;
    }
}
public class solution {

    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S)
    {
        int dist[]=new int[V];
        for(int i=0;i<V;i++)
        {
            dist[i]=Integer.MAX_VALUE;
        }
        dist[S]=0;
        PriorityQueue<Pair>pq=new PriorityQueue<>((x,y)->x.distance-y.distance);
        pq.add(new Pair(0,S));
        while(!pq.isEmpty())
        {
            int distance=pq.peek().distance;
            int node=pq.peek().node;
            pq.remove();
           for(int i=0;i<adj.get(node).size();i++)
           {
               int edge_weight=adj.get(node).get(i).get(1);
               int adj_node=adj.get(node).get(i).get(0);
               if(distance+edge_weight<dist[adj_node])
               {
                   dist[adj_node]=distance+edge_weight;
                   pq.add(new Pair(dist[adj_node],adj_node));
               }

           }

        }
        return dist;

    }
}
