package prims_algorithm;

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

    static int prims(ArrayList<ArrayList<Integer>>adj,int V)
    {
        int visited[]=new int[V];
        PriorityQueue<Pair>pq=new PriorityQueue<>((x,y)->x.distance-y.distance);
        pq.add(new Pair(0,0));
        int sum=0;
        while(!pq.isEmpty())
        {
            int weight=pq.peek().distance;
            int node=pq.peek().node;
            pq.remove();
            if(visited[node]==1)
            {
                continue;
            }
            visited[node]=1;
            sum+=weight;
            for(int i=0;i<adj.get(node).size();i++)
            {
                int edge_weight=adj.get(i).get(1);
                int adj_node=adj.get(i).get(0);
                if(visited[adj_node]==0)
                {
                    pq.add(new Pair(edge_weight,adj_node));
                }
            }

        }
        return sum;

    }
}
