package bfs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class solution {

    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        ArrayList<Integer>al=new ArrayList<>();
        Queue<Integer>queue=new LinkedList<>();
        int s=0;
        queue.add(s);
        boolean visited[]=new boolean[V];
        visited[s]=true;
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
