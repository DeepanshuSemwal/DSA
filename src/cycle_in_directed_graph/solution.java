package cycle_in_directed_graph;

import java.util.ArrayList;

public class solution {

    public static boolean detectCycle(ArrayList<ArrayList<Integer>>adj,int V)
    {
        boolean visited[]=new boolean[V];
        boolean recst[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                if(DfsRec(adj,V,i,visited,recst)==true)
                {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean DfsRec(ArrayList<ArrayList<Integer>>adj,int V,int s,boolean[]visited,boolean[] recst)
    {
        visited[s]=true;
        recst[s]=false;
        for(int u:adj.get(s))
        {
            if(visited[s]==false)
            {
                if(DfsRec(adj, V, s, visited, recst)==true)
                {
                    return true;
                }
            }
            else if(recst[s]==true)
            {
                return true;
            }

        }
        recst[s]=false;
        return false;

    }
}
