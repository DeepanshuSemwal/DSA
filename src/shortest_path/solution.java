package shortest_path;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class solution {

    public static void shortestPath(ArrayList<ArrayList<Integer>>adj,int V,int s)
    {
        // we use bfs
        // taking source as 0
        Queue<Integer>queue=new LinkedList<>();
        boolean visited[]=new boolean[V];
        int dist[]=new int[V];
        Arrays.fill(dist,Integer.MAX_VALUE);
        dist[0]=0;
        queue.add(s);
        while (!queue.isEmpty())
        {
            int u=queue.poll();
            for(int v:adj.get(u))
            {
                if(visited[v]==false)
                {
                    dist[v]=dist[u]+1;
                   visited[v]=true;
                   queue.add(v);
                }
            }
        }

    }
}
