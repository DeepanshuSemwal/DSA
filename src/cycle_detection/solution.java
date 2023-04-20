package cycle_detection;

import java.util.ArrayList;

public class solution
{
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        boolean visited[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
            if(visited[i]==false)
            {
                if(DfsRec(adj,V,i,-1,visited)==true)
                {
                    return true;
                }
            }
        }
        return false;


    }
    public boolean DfsRec(ArrayList<ArrayList<Integer>> adj,int V,int s,int parent,boolean[]visited)
    {
        visited[s]=true;
        for(int u:adj.get(s))
        {
            if(visited[u]==false)
            {
                if(DfsRec(adj,V,u,s,visited)==true)
                {
                    return true;
                }
            }
            else if(u!=parent)
            {
                return true;
            }
        }
        return false;
    }
}
