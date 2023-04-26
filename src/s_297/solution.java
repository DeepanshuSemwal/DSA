package s_297;

import java.awt.desktop.PreferencesEvent;
import java.util.ArrayList;

public class solution {

    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[]visited=new boolean[V];
        boolean resct[]=new boolean[V];
        for(int i=0;i<V;i++)
        {
             if(visited[i]==false)
             {
                 if(dfsRec(adj,i,visited,resct)==true)
                 {
                     return true;
                 }
             }
        }
        return false;

    }

    public boolean dfsRec(ArrayList<ArrayList<Integer>>adj,int s,boolean[]visited,boolean[]resct)
    {
        visited[s]=true;
        resct[s]=true;
        for(int u:adj.get(s))
        {
            if(visited[u]==false && dfsRec(adj,u,visited,resct))
            {
                return true;
            }
            else if(resct[u]==true)
            {
                return true;
            }

        }
        resct[s]=false;
        return false;
    }
}
