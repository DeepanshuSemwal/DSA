package s_294;

import java.util.ArrayList;
import java.util.OptionalInt;

public class solution {

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        // check on gfg

        ArrayList<Integer>al=new ArrayList<>();
        boolean[]visited=new boolean[V];
        for(int i=0;i<V;i++)
        {
            dfsRec(adj,visited,i,al);
        }
        return al;

    }

    public void dfsRec(ArrayList<ArrayList<Integer>> adj, boolean []visited, int s, ArrayList<Integer>al)
    {
        visited[s]=true;
        al.add(s);
        for(int v:adj.get(s))
        {
            if(visited[v]==false)
            {
                dfsRec(adj,visited,v,al);
            }
        }
        return;
    }
}
