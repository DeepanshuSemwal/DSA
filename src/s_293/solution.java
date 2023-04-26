package s_293;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class solution {

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj)
    {
        ArrayList<Integer>al=new ArrayList<>();
        boolean visited[]=new boolean[V];
        Queue<Integer>queue=new LinkedList<>();
        int s=0;
        visited[s]=true;
        queue.add(s);
        while(!queue.isEmpty())
        {
            int u=queue.poll();
            al.add(u);
            for(int v:adj.get(u))
            {
                if(visited[v]==false)
                {
                    visited[v]=true;
                    queue.add(v);
                }
            }

        }
        return al;
    }

}
