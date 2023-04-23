package bellman_ford;

import java.awt.image.AreaAveragingScaleFilter;
import java.util.ArrayList;

public class solution {
    static int[] bellman_ford(int V, ArrayList<ArrayList<Integer>> edges, int S)
    {
        int dist[]=new int[V];
        for(int i=0;i<V-1;i++)
        {
            dist[i]=(int)1e8;
        }
        dist[S]=0;
        for(int i=0;i<V-1;i++)
        {
            for(ArrayList<Integer>al:edges)
            {
                int u=al.get(0);
                int v=al.get(1);
                int wt=al.get(2);
                if(dist[u]!=1e8 && dist[u]+wt<dist[v])
                {
                    dist[v]=dist[u]+wt;
                }
            }
        }

        // checking for negative cycle
        for(int i=0;i<V-1;i++)
        {
            for(ArrayList<Integer>al:edges)
            {
                int u=al.get(0);
                int v=al.get(1);
                int wt=al.get(2);
                if(dist[u]!=1e8 && dist[u]+wt<dist[v])
                {
                    int []temp=new int[1];
                    temp[0]=-1;
                    return temp;
                }
            }
        }
        return dist;

    }
}
