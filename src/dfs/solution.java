package dfs;

import java.util.ArrayList;

public class solution {

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer>al=new ArrayList<>();
        boolean visited[]=new boolean[V];
        int s=0;
        for(int i=0;i<V;i++) // for disconnected graphs
        {
            if(visited[i]==false)
            {
                DfsRec(V,adj,al,s,visited);
            }
        }
        return al;

    }

    public void DfsRec(int V, ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>al,int s,boolean visited[])
    {
       visited[s]=true;
       al.add(s);
       for(int u: adj.get(s))
       {
           if(visited[u]==false)
           {
               DfsRec(V,adj,al,u,visited);
           }
       }
    }





}
