package dfs;

import java.util.ArrayList;

public class solution {

    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer>al=new ArrayList<>();
        boolean visited[]=new boolean[V];
        return DfsRec(V,adj,al,0,visited);

    }

    public ArrayList<Integer> DfsRec(int V, ArrayList<ArrayList<Integer>> adj,ArrayList<Integer>al,int s,boolean visited[])
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
       return al;
    }





}
